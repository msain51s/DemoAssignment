package com.demoassignment.retrofit;

import com.demoassignment.utility.Utils;
import com.google.gson.JsonObject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static java.util.concurrent.TimeUnit.SECONDS;


public class APIClient implements APIRequest{

     Retrofit retrofit=null;
     APIEndpoint serviceEndpoint=null;


    public APIClient(){

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.readTimeout(30, SECONDS)
                .writeTimeout(30, SECONDS)
                .connectTimeout(30, SECONDS);
        OkHttpClient oldclient = httpClient.build();




         retrofit = new Retrofit.Builder()
                .baseUrl(Utils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(oldclient)
                .build();

         serviceEndpoint = retrofit.create(APIEndpoint.class);
    }

    @Override
    public Observable<JsonObject> getArticleList() {
        return serviceEndpoint
                .getArticleList(7, Utils.API_KEY)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

    }

}