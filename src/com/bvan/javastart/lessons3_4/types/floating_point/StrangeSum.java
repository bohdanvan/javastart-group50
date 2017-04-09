package com.bvan.javastart.lessons3_4.types.floating_point;

/**
 * @author bvanchuhov
 */
public class StrangeSum {

    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(0.3 - 0.1);

        System.out.println(0.5 + 0.2);

        double d  = 1.0/3;
        String s = String.format("%.3f", d);
        System.out.println(s);
    }
}
