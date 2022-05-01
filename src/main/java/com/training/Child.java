package com.training;

import com.training.basics.Parent;

public class Child extends Parent {

    @Override
    public String getCurrentInfo() {
        return "What's up?";
    }

    public String getCurrentInfo(String who){
        return super.getCurrentInfo()+", "+who;
    }

    public String getCurrentInfo(String who, String when){
        return super.getCurrentInfo()+", "+who;
    }
}
