package oopInJava.entity;

public class App {
    public static void main(String[]args){
        Phone phone= new Phone();
        phone.sendSMS();

        Phone Phone= new Phone();
        phone.makeCall();

        Phone SmartPhone= new SmartPhone();
        SmartPhone.makeCall();
    }
}
