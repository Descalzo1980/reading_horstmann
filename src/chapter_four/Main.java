package chapter_four;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Date());
//        String date = new Date().toString();
//        System.out.println(date);
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        /**********?????? ??????? ????*******************/
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print(" ");
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
            if (date.getDayOfWeek().getValue() != 1)
                System.out.println();
        }
    }
}