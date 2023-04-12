package com.digdes.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectValue implements WhereParser {
    List<Map<String, Object>> cur = new ArrayList<>();
    private String request = "";
    private String key = "";
    private String val = "";
    public SelectValue(List<Map<String, Object>> cur, String request, int... num) {
        this.cur = cur;
        this.request = request;
    }
    @Override
    public List<Map<String, Object>> update() {
        String condition = request.substring(request.indexOf("where")); // refactor to diff methods
        Pattern pattern = Pattern.compile("(\\w+)=(\\w+)", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher1 = pattern.matcher(condition);
        while(matcher1.find()) {
            val = matcher1.group(2);
            key =  matcher1.group(1);
        }

        for(int i = 0; i < cur.size(); i++) {
            if(cur.get(i).get(key).equals(val)) {
                System.out.println(cur.get(i));
            }
        }
        return cur;
    }
}
