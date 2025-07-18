package com.javaintermediate.partone.lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj added = obj.add(20);

        // 계산 이후의 기존의 값은 사라짐
        System.out.println("obj = " + obj.getValue());
        System.out.println("added = " + added.getValue());
    }
}
