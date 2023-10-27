package Encapsulation;

public class Person {
    private int ssn;
    private byte age;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, Byte age, Integer ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public byte getAge()
    {
        return this.age;
    }

}
