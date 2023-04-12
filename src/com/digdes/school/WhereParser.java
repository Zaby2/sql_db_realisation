package com.digdes.school;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface WhereParser {
    public default List<Map<String, Object>> update() {
        return null;
    };


}
