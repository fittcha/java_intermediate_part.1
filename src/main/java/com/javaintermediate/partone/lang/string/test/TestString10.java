package com.javaintermediate.partone.lang.string.test;

import java.util.Arrays;

public class TestString10 {

    // split()를 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 분리
        String[] splitFruits = fruits.split(",");
        for (String s : splitFruits) {
            System.out.println(s);
        }

        // 합치기
        String joinedString = String.join("->", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}
