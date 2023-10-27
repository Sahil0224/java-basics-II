package Polymorphism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        var person = new ArrayList<Person>();

        var p = new Employee();
        var p1 = new Activity();

        person.add(p);
        person.add(p1);

        for(Person print: person)
        {
            System.out.println(print.name());
        }


    }
}
