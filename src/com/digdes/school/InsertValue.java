package com.digdes.school;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertValue {
    private String request = "";
    private int check;
    public InsertValue(String request) {
        this.request = request;
    }
    public Map<String, Object> insert() {
    Map<String, Object> map = new HashMap<>();
    Pattern pattern = Pattern.compile("(\\w+)=(\\w+)", Pattern.UNICODE_CHARACTER_CLASS);
    Matcher matcher1 = pattern.matcher(request);
        while(matcher1.find()) {
            map.put(matcher1.group(1), matcher1.group(2));
        }
   /* while(matcher1.find()) {
        String cur = matcher1.group(2);
        if((cur.charAt(0) >= '0' && cur.charAt(0) <= '9') && !cur.contains(".")) {
            map.put(matcher1.group(1), Long.valueOf(matcher1.group(2)));
        } else if (cur.contains("true") || cur.contains("false")) {
            map.put(matcher1.group(1), Boolean.valueOf(matcher1.group(2)));
        } else if ((cur.charAt(0) >= '0' && cur.charAt(0) <= '9') && cur.contains(".")) {
            map.put(matcher1.group(1), Double.valueOf(matcher1.group(2)));
        } else {
            map.put(matcher1.group(1), matcher1.group(2));
        }
    }
    pattern = Pattern.compile("(\\w+) = (\\w+)", Pattern.UNICODE_CHARACTER_CLASS);
    matcher1 = pattern.matcher(request);
    while(matcher1.find()) {
        String cur = matcher1.group(2);
        if((cur.charAt(0) >= '0' && cur.charAt(0) <= '9') && !cur.contains(".")) {
            map.put(matcher1.group(1), Long.valueOf(matcher1.group(2)));
        } else if (cur.contains("true") || cur.contains("false")) {
            map.put(matcher1.group(1), Boolean.valueOf(matcher1.group(2)));
        } else if ((cur.charAt(0) >= '0' && cur.charAt(0) <= '9') && cur.contains(".")) {
                map.put(matcher1.group(1), Double.valueOf(matcher1.group(2)));
        } else {
               map.put(matcher1.group(1), matcher1.group(2));
            }
        }*/
    return map;
}
}
