package com.hibanax.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("f3ZdaRNKVtMZJhaPUKz24YwQXuFbl58YVRHJx38e")
                // if defined
                .clientKey("DWxm4wDl7cBpZVFHem0G5jnPzSi5g9Gn2drjwLoV")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
