package oopInJava.entity;

import java.util.Objects;

public class Vehicle {

    //Data Member
    private  final String Model;
    private String Year;
    private  int Fuel;
    private int Wheel;

    //Constructor

    public Vehicle(){
        this.Model="Mahindra Thar";
        System.out.println("Available Model in Market");
    }
    public  Vehicle( String Model){
        this.Model = Model;
    }

//    public void go(){
//        System.out.println("This Vehicle is moving");
//    }
//    public void stop(){
//        System.out.println("This Vehicle is Stopped");
//    }
    public void color(){
        System.out.println("Available Your Favorite Color");
    }
    public void speed(){
        System.out.println("Vehicle are very Fasted Speed ");
    }
    // Getter and Setter
    public String getModel(){
        return Model;
    }

    public String getYear(){
        return Year;
    }
    public int getFuel(){
        return Fuel;
    }

    public int getWheel(){
        return Wheel;
    }

    //Setters

    public void setYear(){
        this.Year= Year;
    }
    public void setFuel(){
        this.Fuel=Fuel;
    }
    public void setWheel(){
        this.Wheel=Wheel;
    }

    // To String
    @Override
    public String toString(){
        return String.format("Model:%s....Year:%s",this.Model,this.Year);
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Vehicle vehicle=(Vehicle) o;
        return Objects.equals(this.Model,vehicle.Model) && Objects.equals(this.Year,vehicle.Year);
    }
    @Override
    public int hashCode(){
        return Objects.hash(Model,Year);
    }
}
