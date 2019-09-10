package com.example.swimminggo.constant;

public class URLConstant {
    private String mainUrl = "";

    private static URLConstant ourInstance;

    public static URLConstant getInstance() {
        if (ourInstance == null)
            ourInstance = new URLConstant();
        return ourInstance;
    }

    public String getMainUrl(){
        return mainUrl;
    }

    private URLConstant() {
    }
}
