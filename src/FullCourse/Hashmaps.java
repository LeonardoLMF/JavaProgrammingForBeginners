package FullCourse;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("English", 100);
        examScores.put("Portuguese", 81);

        //examScores.clear();
        //examScores.remove("English");

        examScores.forEach((subject, score)-> {
            examScores.replace(subject,score - 10);
            System.out.println(subject + " - " + score);
        });

        System.out.println(examScores.toString());
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.isEmpty());
    }
}
