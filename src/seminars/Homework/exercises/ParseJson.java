package seminars.homework.exercises;

public class ParseJson {
    public static StringBuilder jsonToString(String in) {
        StringBuilder sb = new StringBuilder();
        String[] items = in.split(",");

        for (String s : items) {
            if (s.split(":")[0].trim().replaceAll("[\"{}\\[\\]]", "").equals("фамилия")){
                sb.append("Студент ")
                        .append(s.replaceAll("[\"{}\\[\\]]", "")
                            .split(":")[1]);
            }
            if (s.split(":")[0].replaceAll("[\"{}\\[\\]]", "").equals("оценка")) {
                sb.append(" получил(а) ")
                        .append(s.split(":")[1]
                            .replaceAll("[\"{}\\[\\]]", ""));
            }
            if (s.split(":")[0]
                        .replaceAll("[\"{}\\[\\]]", "").equals("предмет")) {
                sb.append(" по предмету ")
                        .append(s.split(":")[1]
                            .replaceAll("[\"{}\\[\\]]", "")).append(".\n");
            }
        }
        return sb;
    }
}