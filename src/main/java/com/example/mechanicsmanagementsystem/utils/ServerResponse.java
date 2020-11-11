package com.example.mechanicsmanagementsystem.utils;

public class ServerResponse<T> {
    public int status;

    public String message;

    public T data;

    private ServerResponse(){}

    private ServerResponse(int status, T data, String msg){
        this.status = status;
        this.data  = data;
        this.message = msg;
    }

    private ServerResponse(int status) {
        this.status = status;
    }

    public static ServerResponse serverSuccess(){
        return new ServerResponse(200);
    }

    public static ServerResponse serverFailed() {
        return new ServerResponse(401);
    }

    public static <T> ServerResponse serverSuccess(T data) {
        return new ServerResponse(200, data, "success");
    }
}
