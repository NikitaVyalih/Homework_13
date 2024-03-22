package org.nikita.example_3;

public class Test_1 {

    public static void main(String[] args) {

        int hour = 0;

        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        }
        while (hour < 24);




    }
}
