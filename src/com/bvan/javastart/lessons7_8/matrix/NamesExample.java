package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class NamesExample {

    public static void main(String[] args) {
        String[] names = {
                "John",
                "Bob",
                "Phil"
        };
        System.out.println(Arrays.toString(names));

        char c = names[1].charAt(0);
        System.out.println(c);
    }
}
