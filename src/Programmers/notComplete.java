package Programmers;

import java.util.HashMap;
import java.util.Map;

public class notComplete {

    public static void main(String[] args) {


        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        Map<String, Integer> map = new HashMap<>();


        for (String name : participant) {
            if (map.get(name) == null) {
                map.put(name, 1);
            } else {
                int value = map.get(name);
                map.put(name, value);
            }
        }

        System.out.println(map.keySet());

        for (String name : completion) {
            int value = map.get(name) - 1;
            map.put(name, value);
        }

        System.out.println(map.values());

        String answer = "";
        for (String name : map.keySet()) {
            if (map.get(name) == 1) answer = name;
        }

    }
}