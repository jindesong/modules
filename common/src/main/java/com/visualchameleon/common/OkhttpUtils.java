package com.visualchameleon.common;

class OkhttpUtils {
    private static OkhttpUtils instance;
    public static OkhttpUtils getInstance(){
        if(instance == null){
            instance = new OkhttpUtils();
        }
        return instance;
    }
    public OkhttpUtils(){

    }

    public String getResult(){
        return "aaa";
    }

}
