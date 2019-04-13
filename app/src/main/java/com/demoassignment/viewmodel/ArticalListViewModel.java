package com.demoassignment.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.demoassignment.model.Result;
import com.demoassignment.retrofit.APIClient;
import com.demoassignment.utility.Utils;
import com.google.gson.JsonObject;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ArticalListViewModel extends ViewModel {

    private static final String TAG="ArticleDAta";

    private APIClient apiClient = new APIClient();
    private MutableLiveData<List<Result>> mutableArticleData = null;

    public MutableLiveData<List<Result>> getMutableArticleData() {
        if (mutableArticleData == null)
            mutableArticleData = new MutableLiveData<>();

        return mutableArticleData;
    }


    public void getArticleList() {

        apiClient.getArticleList()
                .subscribe(new Observer<JsonObject>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d(TAG, "onSubscribe");
                    }

                    @Override
                    public void onNext(JsonObject value) {

                        Log.d(TAG, value.toString());

                        mutableArticleData.setValue(Utils.getResultList(value));
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "Throwable" + e.getLocalizedMessage() + " error " + e.getMessage() + " error " + e.getStackTrace());
                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "onComplete");
                    }
                });

    }


}
