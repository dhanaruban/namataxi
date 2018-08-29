package com.dhanaruban.namataxi.Common;

import android.location.Location;

import com.dhanaruban.namataxi.Model.User;
import com.dhanaruban.namataxi.Remote.FCMClient;
import com.dhanaruban.namataxi.Remote.IFCMService;
import com.dhanaruban.namataxi.Remote.IGoogleAPI;
import com.dhanaruban.namataxi.Remote.RetrofitClient;

public class Common {



    public  static final String driver_tb1 = "Drivers";
    public  static final String user_driver_tb1 = "DriversInformation";
    public  static final String user_rider_tb1 = "RidersInformation";
    public  static final String pickup_request_tb1 = "PickupRequest";
    public  static final String token_tb1 = "Tokens";

    public static User currentUser;
    public static Location mLastLocation = null;


    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
