package com.javaintermediate.partone.lang.object.test;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
@RequiredArgsConstructor
public class Rectangle {

    private int width;
    private int height;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
