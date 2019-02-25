package com.bufeotec.angelo.reconocimiento;

import android.content.Context;
import android.content.SharedPreferences;

public class Pref {
    public static String read(Context ctx, String settingName, String defaultValue){
        SharedPreferences sharedPref = ctx.getSharedPreferences("reconocimiento",Context.MODE_PRIVATE);
        return sharedPref.getString(settingName,defaultValue);
    }

    public static  void write (Context ctx,String settingName, String settingValue){
        SharedPreferences sharedPref = ctx.getSharedPreferences("reconocimiento",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(settingName,settingValue);
        editor.apply();
    }
}
