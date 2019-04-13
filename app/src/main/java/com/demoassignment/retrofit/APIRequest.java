package com.demoassignment.retrofit;

import com.google.gson.JsonObject;

import io.reactivex.Observable;


public interface APIRequest {

    public Observable<JsonObject> getArticleList();
}
