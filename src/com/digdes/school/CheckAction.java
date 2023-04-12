package com.digdes.school;

public class CheckAction {
    private String action = "";
    private int result;
    CheckAction(String action) {
        this.action = action;
    }
    public int check() {
        if(action.contains("insert")) {
            result = 1;
        }
        else if(action.contains("update")) {
            result = 2;
        }
        else if (action.contains("delete")){
            result = 3;
        }
        else if (action.contains("select")) {
            result = 4;
        }
        return result;
    }
}
