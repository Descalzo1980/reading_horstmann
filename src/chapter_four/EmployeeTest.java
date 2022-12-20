package chapter_four;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Boo", 35000.00);
        staff[1] = new Employee(55000.00);
        staff[2] = new Employee();

        for (Employee e : staff){
            System.out.println("Name= " + e.getName() + ",id=" + e.getId() + ",salary="+ e.getSalary());
        }
    }
}
