package com.digdes.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpdateValue implements WhereParser {
    List<Map<String, Object>> cur = new ArrayList<>();
    private String request = "";
    private String key = "";
    private String val = "";
    public UpdateValue(List<Map<String, Object>> cur, String request, int... num) {
        this.cur = cur;
        this.request = request;
    }
    @Override
    public List<Map<String, Object>> update() {
        String condition = request.substring(request.indexOf("where"));
        Pattern pattern = Pattern.compile("(\\w+)=(\\w+)", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher1 = pattern.matcher(condition);
        while(matcher1.find()) {
            val = matcher1.group(2);
            key =  matcher1.group(1);
        }

        pattern = Pattern.compile("(\\w+)=(\\w+)", Pattern.UNICODE_CHARACTER_CLASS);
        for(int i = 0; i < cur.size(); i++) {
            matcher1 = pattern.matcher(request);
            if(cur.get(i).get(key).equals(val)) {
                while(matcher1.find()) {
                    cur.get(i).put(matcher1.group(1), matcher1.group(2));
                }
            }
        }
        return cur;
    }

}
