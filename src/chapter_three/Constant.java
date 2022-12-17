package chapter_three;

import java.util.Arrays;

public class Constant {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in cm: "
        + paperWidth * CM_PER_INCH + " by "
                + paperHeight * CM_PER_INCH);

        int[] a = new int [10];
        for (int i = 0;i < 10;i++) {
            a[i] = i;
            System.out.println(i);
        }
        System.out.println(Arrays.toString(a));

        String[] strings = new String[10];
        for (int i =0;i < 10;i++){
            strings[i] = "";
            System.out.println(Arrays.toString(strings)); // null потому что String это объект
        }

    }
}
