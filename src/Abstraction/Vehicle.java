package Abstraction;

public abstract class Vehicle {
    private String color;
    private int speed;
    private int wheels;

    public Vehicle(String color, int speed, int wheels)
    {
        this.color = color;
        this.speed = speed;
        this.wheels = wheels;
    }

    public String getColor()
    {
        return this.color;
    }
  
    public int getSpeed()
    {
        return this.speed;
    }

    public int getWheels()
    {
        return this.wheels;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
  
    public abstract void honk();
 
}
