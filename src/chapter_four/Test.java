package chapter_four;

public interface Test {
    default void getMyData(){
        System.out.println("This is Sparta");
    }
}
