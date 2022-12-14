package chapter_three;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double first = 2.0;
        double second = 1.1;
        char check = '@';
        boolean res,res1;
        res = Character.isJavaIdentifierStart(check);
        res1 = Character.isJavaIdentifierPart(check);
        System.out.println("Result = " + (first - second));
        System.out.println(res);
        System.out.println(res1);
    }
}
