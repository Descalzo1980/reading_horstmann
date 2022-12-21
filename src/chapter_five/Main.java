package chapter_five;

import chapter_four.Employee;

public class Main {
    public static void main(String[] args) {

        Manager boss = new Manager("Joe", 35000,2);
        boss.setBonus(5000);

        Employee[] staff = new Employee[2];
        staff[0] = boss;
        staff[1] = new Employee("Boo",4000);
        for(Employee e : staff){
            System.out.println("name = " + e.getName() + " salary " + e.getSalary());
        }


    }
}
