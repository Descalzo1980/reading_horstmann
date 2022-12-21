package chapter_five;

import chapter_four.Employee;
import chapter_four.Test;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int id) {
        super(name, salary, id);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }

}
