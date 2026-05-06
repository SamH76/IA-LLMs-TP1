package ht.mbds.samanthahenry.tp1samanthahenry09.utils;

public class RequeteException extends RuntimeException{
    private String details;
    public RequeteException(String statusInfo,String details) {
        super(statusInfo);
        this.details = details;
    }
}
