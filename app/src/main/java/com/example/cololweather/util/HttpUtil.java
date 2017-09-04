package com.example.cololweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by huangzelei on 2017/9/4.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
