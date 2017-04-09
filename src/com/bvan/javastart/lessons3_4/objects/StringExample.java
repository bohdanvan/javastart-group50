package com.bvan.javastart.lessons3_4.objects;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello, Java";

        int length = s.length();
        System.out.println("length = " + length);

        char c = s.charAt(2);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        String lowerCase = s.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        boolean startsWith = s.startsWith("Java");
        System.out.println("startsWith = " + startsWith);

        int indexOfJava = s.indexOf("Java");
        System.out.println("indexOfJava = " + indexOfJava);

        boolean equals = s.equals("Hello, Java");
        System.out.println("equals = " + equals);

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
