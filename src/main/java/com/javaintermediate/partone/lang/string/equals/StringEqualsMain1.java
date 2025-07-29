package com.javaintermediate.partone.lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        // 객체 비교
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals() 비교: " + (str1.equals(str2)));
        //equals() 비교: String 객체에서 이미 오버라이딩 해놓음. 문자 배열로 비교

        // 리터럴 비교
        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교: " + (str3 == str4)); // ??
        System.out.println("리터럴 equals() 비교: " + (str3.equals(str4)));

        // 문자열로 String 정의했을 때 new String() 객체 만들어주는 것 아닌가? 동일성 비교 왜 성공하지
        // 문자열 풀
    }
}
