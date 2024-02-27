package oopInJava.entity;



public class Car extends Vehicle {
    private final String Engine;
    private String Battery;
    private int Capacity;
    private int Seat;

    public Car(){
        super();
        this.Engine="Electric Engine";
    }
    public Car(String Engine,String Battery,int Capacity,int Seat){
        super();
        this.Engine = Engine;
        this.Battery = Battery;
        this.Capacity = Capacity;
        this.Seat = Seat;
    }
    // Member Function

    @Override
    public void color(){
        System.out.println("This is a attractive color");

    }

   @Override
    public void speed(){
        System.out.println("the Car speed are very Fasted.....");
    }
    public void go(){
        System.out.println("This Vehicle is moving");
    }
    public void stop(){
        System.out.println("This Vehicle is Stopped");
    }

    public String getEngine(){
        return Engine;
    }
    public String getBattery(){
        return Battery;
    }
    public void setBattery(String Battery){
        this.Battery= Battery;
    }
    public int getCapacity(){
        return Capacity;
    }
    public void setCapacity(int Capacity){
        this.Capacity = Capacity;
    }
    public int getSeat(){
       return Seat;
    }
    public void setSeat(int Seat){
        this.Seat=Seat;
    }

    @Override
    public String toString(){
        return "Car{"+
                "Engine='" + Engine + '\''+
                ",Battery = '" + Battery + '\'' +
                ",Capacity=" + Capacity +
                ",Seat='" + Seat + '\''+
                '}';
    }
}
