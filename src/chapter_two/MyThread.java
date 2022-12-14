package chapter_two;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Название потока " + getName());
    }
}
