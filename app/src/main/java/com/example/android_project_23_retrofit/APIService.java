package com.example.android_project_23_retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("name") String name,
                        @Field("description") String description,
                        @Field("categoryId") long categoryId);
}
