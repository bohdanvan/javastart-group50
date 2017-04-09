package com.bvan.javastart.lessons3_4.loops.working_week;

/**
 * @author bvanchuhov
 */
public class WorkingWeekDoWhile {

    public static void main(String[] args) {
        int day = 1;

        do {
            System.out.println(day + ": Work");
            day++;
        } while (day <= 5);
    }
}
