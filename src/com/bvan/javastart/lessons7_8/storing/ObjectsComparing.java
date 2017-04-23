package com.bvan.javastart.lessons7_8.storing;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class ObjectsComparing {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false
        System.out.println(Objects.equals(s1, s2)); // true
    }
}
