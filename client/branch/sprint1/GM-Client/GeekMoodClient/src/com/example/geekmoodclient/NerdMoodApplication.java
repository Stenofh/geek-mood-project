package com.example.geekmoodclient;

import com.example.geekmoodclient.db.NerdMoodDB;

import android.app.Application;

public class NerdMoodApplication extends Application {

    @Override
    public void onCreate() {
	super.onCreate();
	new NerdMoodDB(this);
    }
}
