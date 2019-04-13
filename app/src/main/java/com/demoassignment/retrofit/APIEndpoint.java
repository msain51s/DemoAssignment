package com.demoassignment.retrofit;


import com.google.gson.JsonObject;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIEndpoint {

    @GET("svc/mostpopular/v2/viewed/{period}.json")
    Observable<JsonObject> getArticleList(
            @Path("period") int period,
            @Query("api-key") String apiKey
    );
}
