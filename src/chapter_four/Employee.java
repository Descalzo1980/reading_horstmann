package chapter_four;


import java.util.Random;

public class Employee implements Test{

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }

    public Employee (String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public Employee(double s){
        this("Employee " + nextId,s);
    }
    public Employee(){

    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
}