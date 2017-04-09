package com.bvan.javastart.lessons3_4.loops.working_week;

/**
 * @author bvanchuhov
 */
public class WorkingWeekWhile {

    public static void main(String[] args) {
        int day = 1; // 1..7

        while (day <= 5) {
            System.out.println(day + ": Work");
            day++;
        }

        System.out.println("Goodbye");
    }
}
