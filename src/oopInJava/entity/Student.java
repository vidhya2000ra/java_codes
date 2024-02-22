package oopInJava.entity;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;

    //Default Constructor
    public Student(){
        super();
        this.firstName = "vidhya";
        this.middleName = "Raviprakash";
        this.lastName = "Raut";
        this.email = "v@gmail.com";
        this.phone = "235456456456";
    }

//    private String name;
    //get method value string
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }

    //set method value string
    public void setFirstName( ){
        this.firstName= firstName;
    }
    public void setMiddleName( ){
        this.middleName= middleName;
    }
    public void setLastName( ){
        this.lastName= lastName;
    }
    public void setEmail( ){
        this.email= email;
    }
    public void setPhone( ){
        this.phone= phone;
    }

    public static void main (String[]args){



    }
}
