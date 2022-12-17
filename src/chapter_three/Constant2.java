package chapter_three;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class Constant2 {

    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) throws IOException {
        enum Size {Small,Medium,Large,Big}
        Size size = Size.Big;
        String res = size.toString().toUpperCase();
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in cm: "
                + paperWidth * CM_PER_INCH + " by "
                + paperHeight * CM_PER_INCH);
        System.out.println(size.toString().toUpperCase());
        double x = 4;
        double a = 2;
        double y = Math.sqrt(x);
        double z = Math.pow(x,2);
        System.out.println(y);
        System.out.println(z);

        int n = 123456789;
        float f = n;
        System.out.println(f);
        double b = 9.997;
        int nx = (int)b;
        System.out.println(nx);
        String greeting = "Hello";
        String s = greeting.substring(0,3) + "p!";
        System.out.println(s);
        String all = String.join("/","H","E","L","L","O");
        System.out.println(all);
        String repeated = "Viva Java ".repeat(3);
        System.out.println(repeated);
        boolean t = "Hello".equalsIgnoreCase(greeting);
        boolean r = "Hello".equals(greeting);
        System.out.println(t);
        System.out.println(r);
        String greetingNew = "Hello";
        int newNum = greetingNew.length();
        System.out.println(newNum);
        int countGreeting = greetingNew.codePointCount(0,greetingNew.length());
        System.out.println(countGreeting);
        char first = greetingNew.charAt(0);
        System.out.println(first);
        int index = greetingNew.offsetByCodePoints(0,3);
        System.out.println(index);
        String qw = "Hello             ";
        String qw1 = "Hello";
        System.out.println(qw.equalsIgnoreCase(qw1));
        System.out.println(qw.startsWith(qw1));
        System.out.println(qw.endsWith(qw1));
        System.out.println(qw.replace("lo", "p"));
        System.out.println(qw.toLowerCase());
        System.out.println(qw.toUpperCase());
        System.out.println(qw.trim());
        System.out.println(qw.trim().repeat(2));

        StringBuilder builder = new StringBuilder();
        builder.append("H");
        builder.append("e");
        builder.append("l");
        builder.append("p");
        builder.append("!");
        String completedString = builder.toString();
        System.out.println(completedString);
        builder.insert(5,"?");
        System.out.println(builder);

/*        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("What is your age?");
        int age = in.nextInt();
        System.out.println("Hello " + name + " your age " + age);*/

        double xf = 10000 / 3.0;
        System.out.printf("%8.2f",xf);
        System.out.printf("%tc",new Date());
        System.out.println("*".repeat(20));
        File file = new File("D:\\myfile.txt");
        Scanner sc =new Scanner(file,StandardCharsets.UTF_8);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        int i = 10;
        while(i > 0){
            System.out.println("Counting down..." + i);
            i--;
        }
        for (int j = 10; j > 0; j--) {
            System.out.println("Counting down..." + j);
        }

        int[] a1 = new int[100];

    }
}
