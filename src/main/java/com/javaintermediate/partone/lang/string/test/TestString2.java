package com.javaintermediate.partone.lang.string.test;

public class TestString2 {

    //Q. length()를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구하라

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String str : arr) {
            System.out.println(str + ":" + str.length());
            sum += str.length();
        }
        System.out.println("sum = " + sum);
    }
}
