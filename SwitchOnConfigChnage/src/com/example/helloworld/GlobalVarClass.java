package com.example.helloworld;

import android.app.Application;

public class GlobalVarClass  extends Application{

    private String globalVariable1,globalVariable2;

    public String getGlobalVariable1(){return globalVariable1;}
    public String getGlobalVariable2(){return globalVariable2;}

    public void setGlobalVariable1(String variable1){globalVariable1 = variable1;}
    public void setGlobalVariable2(String variable2){globalVariable2 = variable2;}
}
