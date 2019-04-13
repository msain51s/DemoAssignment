package com.demoassignment.utility;

import com.demoassignment.model.Result;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static final String BASE_URL="https://api.nytimes.com/";
    public static final String API_KEY="atnxrrDeLGL3DZAv2ntSGT9axUEupfGA";

    private Utils(){}

    public static List<Result> getResultList(JsonObject value){
        JsonArray resultArr=value.getAsJsonArray("results");
        List<Result> resultList=new ArrayList<>();
        Result result=null;

        for(JsonElement element:resultArr){
            result=new Result();
            result.setAdxKeywords(element.getAsJsonObject().get("adx_keywords").getAsString());
            result.setByline(element.getAsJsonObject().get("byline").getAsString());
            result.setPublishedDate(element.getAsJsonObject().get("published_date").getAsString());
            result.setSection(element.getAsJsonObject().get("section").getAsString());
            result.setTitle(element.getAsJsonObject().get("title").getAsString());
            result.setAbstract(element.getAsJsonObject().get("abstract").getAsString());

            resultList.add(result);
        }

        return resultList;
    }

}
