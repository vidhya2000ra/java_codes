package oopInJava.entity;

public class Example1 {

    public static void main(String[]args){
        Student s= new Student();
        s.setFirstName();
        s.setMiddleName();
        s.setLastName();
        s.setEmail();
        s.setPhone();
        System.out.println(s.getFirstName());
        System.out.println(s.getMiddleName());
        System.out.println(s.getLastName());
        System.out.println(s.getEmail());
        System.out.println(s.getPhone());
    }
}
