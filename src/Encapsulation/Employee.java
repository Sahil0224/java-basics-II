package Encapsulation;

public class Employee extends Person{
    private double salary;

    public Employee(String firstName, String lastName, byte age, int ssn, double salary)
    {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak()
    {
        return "Employee name is " + this.getFirstName() + this.getLastName() + " and salary is " + this.salary;
    }
}
