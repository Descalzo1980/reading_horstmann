package chapter_two;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread();
            thread.start();

            String greeting = "Welcome to Java";
            System.out.println(greeting);
            for (int j = 0; j < greeting.length(); j++) {
                System.out.println("=");
                System.out.println();
            }
        }
    }
}
