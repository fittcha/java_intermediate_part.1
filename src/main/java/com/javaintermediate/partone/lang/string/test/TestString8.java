package com.javaintermediate.partone.lang.string.test;

public class TestString8 {

    // replace()를 사용해서 java라는 단어를 jvm으로 변경해라
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        String replace = input.replace("java", "jvm");
        System.out.println(replace);
    }
}
