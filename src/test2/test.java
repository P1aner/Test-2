package test2;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Слово", 1);
        for (String str : map.keySet()) {
            if (str.equals("Слово")) {
                str = "словечко";
            }
        }

        map.put("Слово", map.get("Слово")+2);

        System.out.println(map.get("Слово"));
    }
}
