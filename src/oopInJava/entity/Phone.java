package oopInJava.entity;

import java.util.Objects;

public class Phone {
    // Data Member
    private  final String IMEI;
    private String phone_number;
    private Float balance;

    // Constructors

    public Phone(){
        this.IMEI= "MH2345453";
        System.out.println("Creating Phone");
    }
    public Phone(String IMEI){
        this.IMEI = IMEI;
    }

    // Methods

    public void sendSMS(){
        System.out.println("Hey!,There");
    }
    public void makeCall(){
        System.out.println("Hello.....");
    }

    // Getters And Setter

    public String getIMEI(){
        return IMEI;
    }
    public String getPhone_number(){
        return phone_number;
    }
    // Setters

    public void  setPhone_number(String phoneNumber){
        phone_number = phoneNumber;
    }

    // To String

    @Override
    public String toString(){
        return String.format("IMEI:%s.....Phone:%s",this.IMEI,this.phone_number);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(this.IMEI,phone.IMEI) && Objects.equals(this.phone_number,phone.phone_number);
    }

    @Override
    public int hashCode(){
        return Objects.hash(IMEI,phone_number);
    }

}
