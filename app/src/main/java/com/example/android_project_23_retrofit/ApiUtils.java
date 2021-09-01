package com.example.android_project_23_retrofit;

public class ApiUtils {
    private ApiUtils() {}
    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";
    public static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
