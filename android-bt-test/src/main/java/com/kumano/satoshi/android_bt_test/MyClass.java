package com.kumano.satoshi.android_bt_test;

import com.squareup.okhttp.Request;

public class MyClass {
    public void myMethod() {
        Request r = new Request.Builder().url("https://api.kii.com/api").get().build();
    }
}
