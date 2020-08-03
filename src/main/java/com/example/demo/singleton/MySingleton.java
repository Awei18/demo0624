package com.example.demo.singleton;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/8/3 15:03
 */
public class MySingleton {
    private static MySingleton mySingleton;

    private MySingleton(){

    }

    private static MySingleton getInstance(){
        if (mySingleton == null){
            synchronized (MySingleton.class){
                mySingleton = new MySingleton();
            }
        }
        return mySingleton;
    }
}
