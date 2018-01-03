package com.example.joker.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Joker on 2018/1/3.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        // 创建okhttpclient对象
        OkHttpClient client = new OkHttpClient();
        // 创建请求方式根据网络地址发送一个请求给要访问的网络地址
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
