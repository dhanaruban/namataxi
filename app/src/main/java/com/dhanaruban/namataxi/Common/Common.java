package com.dhanaruban.namataxi.Common;

import com.dhanaruban.namataxi.Remote.IGoogleAPI;
import com.dhanaruban.namataxi.Remote.RetrofitClient;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
