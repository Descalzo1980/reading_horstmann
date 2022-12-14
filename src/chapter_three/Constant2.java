package chapter_three;

public class Constant2 {

    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args) {
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
        String s = greeting.substring(0,3);
        System.out.println(s);
    }
}
