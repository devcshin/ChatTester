package com.example.devc2.chattester;

/**
 * Created by DEVC2 on 2017-01-09.
 */

public class ChatData {
    private String userName;
    private String message;

    public ChatData(){}

    public ChatData(String userName, String message){
        this.userName = userName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //
//    public String getUserName(){
//        return userName;
//    }
//
//    public void setUserName(String userName){
//        this.userName = userName;
//    }
//
//    public String getMessage(){
//        return message;
//    }
//
//    public void setMessage(String message){
//        this.message = message;
//    }
//


}
