package com.javaintermediate.partone.lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        // 대문자로 시작 > 객체, 참조형
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

    }
}
