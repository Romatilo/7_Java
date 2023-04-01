package seminars.homework.exercises;

import jsonSimple.JsonObject;
import json_simple.Jsonable;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JsonToFormattedString {
    public static void jsonToString(String json) {
        Object o = new JSONParse().parse(new FileReader(Example.json));
    }
        JSONArray jsonArray = new JSONArray(json);
        StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String surname = obj.getString("фамилия");
            String mark = obj.getString("оценка");
            String subject = obj.getString("предмет");
            sb.append("Студент ").append(surname).append(" получил ").append(mark)
            .append(" по предмету ").append(subject).append(".").append("\n");
            }
            System.out.println(sb.toString());