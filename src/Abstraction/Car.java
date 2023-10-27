package Abstraction;

public class Car extends Vehicle{
    public boolean convertible;

    public Car(String color, int speed, int wheels, boolean convertible)
    {
        super(color, speed, wheels);
        this.convertible = convertible;
    }

    public boolean getConvertible()
    {
        return this.convertible;
    }

    public void setConvertible(boolean convertible)
    {
        this.convertible = convertible;
    }

    public void honk()
    {
        System.out.println("Beep Beep!");
    }
}
