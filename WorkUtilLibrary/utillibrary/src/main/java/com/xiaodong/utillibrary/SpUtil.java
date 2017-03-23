package com.xiaodong.utillibrary;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;

import java.util.Set;

/**
 * Created by yxd on 2017/3/27 0027.
 */

public class SpUtil {

    public static void save2SpString(Context context,String key,String value){
        SharedPreferences preferences = context.getSharedPreferences("mPreference",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key,value);
        editor.apply();
    }

    public static void save2SpInt(Context context,String key,int value){
        SharedPreferences preferences = context.getSharedPreferences("mPreference",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key,value);
        editor.apply();
    }

    public static void save2SpBoolean(Context context,String key,boolean value){
        SharedPreferences preferences = context.getSharedPreferences("mPreference",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }

    public static void save2SpFloat(Context context,String key,float value){
        SharedPreferences preferences = context.getSharedPreferences("mPreference",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(key,value);
        editor.apply();
    }
    public static void save2SpLong(Context context,String key,long value){
        SharedPreferences preferences = context.getSharedPreferences("mPreference",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key,value);
        editor.apply();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void save2SpSet(Context context, String key, Set<String> value){
        SharedPreferences preferences = context.getSharedPreferences("mPreference",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putStringSet(key,value);
        editor.apply();
    }

    public static void save2DfSpString(Context context,String key,String value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key,value);
        editor.apply();
    }

    public static void save2DfSpInt(Context context,String key,int value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key,value);
        editor.apply();
    }

    public static void save2DfSpLong(Context context,String key,long value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putLong(key,value);
        editor.apply();
    }

    public static void save2DfSpFloat(Context context,String key,float value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat(key,value);
        editor.apply();
    }

    public static void save2DfSpBoolean(Context context,String key,Boolean value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void save2DfSpSet(Context context, String key, Set<String> value){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putStringSet(key,value);
        editor.apply();
    }


    public static String getSpStringValueByKey(Context context,String key,String dft){
        String value;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        value = preferences.getString(key,dft);
        return value;
    }


    public static Boolean getSpBooleanValueByKey(Context context,String key,boolean dft){
        boolean value ;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        value = preferences.getBoolean(key,dft);
        return value;
    }


    public static int getSpIntValueByKey(Context context,String key,int dft){
        int value;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        value = preferences.getInt(key,dft);
        return value;
    }


    public static long getSpLongValueByKey(Context context,String key,long dft){
        long value;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        value = preferences.getLong(key,dft);
        return value;
    }


    public static float getSpStringValueByKey(Context context,String key,float dft){
        float value;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        value = preferences.getFloat(key,dft);
        return value;
    }


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Set<String> getSpStringValueByKey(Context context, String key, Set<String> dft){
        Set<String> value;
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        value = preferences.getStringSet(key,dft);
        return value;
    }
}
