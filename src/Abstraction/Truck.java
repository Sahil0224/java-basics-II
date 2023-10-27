package Abstraction;

public class Truck extends Vehicle
{   
    private int capacity;

    public Truck(String color, int speed, int wheels, int capacity)
    {
        super(color, speed, wheels);
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void honk()
    {
        System.out.println("Honk Honk!");
    }

}
