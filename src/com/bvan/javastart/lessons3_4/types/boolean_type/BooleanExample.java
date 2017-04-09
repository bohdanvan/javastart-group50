package com.bvan.javastart.lessons3_4.types.boolean_type;

/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        System.out.println(10 < 20); // T
        System.out.println(30 < 10); // T
        System.out.println(20 == 40); // F
        System.out.println(20 != 40); // T
    }
}
