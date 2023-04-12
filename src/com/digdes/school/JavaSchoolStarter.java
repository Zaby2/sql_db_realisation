package com.digdes.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaSchoolStarter {
    List<Map<String, Object>> res = new ArrayList<>();
    private int act;
    public JavaSchoolStarter() {}
    public List<Map<String, Object>> execute(String request) {
        request = request.toLowerCase();
        request = request.replaceAll("\\s+", " ");
        request = request.replaceAll("= ", "=");
        request = request.replaceAll(" =", "=");
        request = request.replaceAll(" = ", "=");
        request = request.replaceAll(",", "");
        request = request.replaceAll("’", "");
        request = request.replaceAll("‘", "");
        CheckAction ch = new CheckAction(request);
        act = ch.check();
        if (act == 1) {
            InsertValue iv = new InsertValue(request);
            res.add(iv.insert());
        }
        else if(act == 2) {
            UpdateValue upv = new UpdateValue(res, request);
            upv.update();
        } else if(act == 3) {
                DeleteValue dlv = new DeleteValue(res, request);
                dlv.update();
        } else if(act == 4) {
            SelectValue scl = new SelectValue(res, request);
            scl.update();
        }

        System.out.println(res);
        return new ArrayList<>();
    }
}
