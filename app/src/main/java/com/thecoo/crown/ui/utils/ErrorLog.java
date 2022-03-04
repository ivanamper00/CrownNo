package com.thecoo.crown.ui.utils;

import android.util.Log;


public class ErrorLog {
    static String logParam = "Wooff";

    public static void WriteDebugLog(String txt) {
        try{
            Log.d(logParam, txt);
        } catch (Exception e){

        }
    }

    public static void WriteDebugLog(Exception e) {
        ErrorLog.WriteErrorLog(e);
    }

    public static void WriteErrorLog(Exception e){
        try{

            Log.d(logParam, "\r\n" +
                    "Time: " + "$current" + "\r\n" +
                    "Method Name: " + e.getStackTrace()[0].getMethodName() + "\r\n" +
                    "Err Num: " + e.getStackTrace()[0].getLineNumber() + "\r\n" +
                    "Err Desc: " + e.getMessage() + "\r\n" +
                    "FileName: " + e.getStackTrace()[0].getFileName() + "\r\n" +
                    "");

//            FirebaseCrashlytics.getInstance().recordException(e);
        } catch (Exception e2){
//            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}
