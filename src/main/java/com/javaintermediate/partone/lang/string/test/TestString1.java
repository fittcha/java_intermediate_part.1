package com.javaintermediate.partone.lang.string.test;

public class TestString1 {

    // Q. startWith()를 사용해서 url이 https://로 시작하는지 확인해라

    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean result = url.startsWith("https://www.example.com");
        System.out.println(result);
    }
}
