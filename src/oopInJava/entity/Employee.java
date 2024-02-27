package oopInJava.entity;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String contact;
    private String email;
    private String permanentAddress;

    public Employee(){
        super();
        this.employeeId="53535";
        this.employeeName="Vidhya Raviprakash Raut";
        this.contact="8805676655";
        this.email="vr@gmai.com";
        this.permanentAddress="At-Bhavani Nagar,Nagpur";
    }

    //get method value string

    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public String getContact(){
        return contact;
    }
    public String getEmail(){
        return  email;
    }
    public String getPermanentAddress(){
        return permanentAddress;
    }

    //get method value void


    public void setEmployeeId() {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(){
        this.employeeName=employeeName;
    }
    public void setContact(){
        this.contact=contact;
    }
    public void setEmail(){
        this.email=email;
    }
    public void setPermanentAddress(){
        this.permanentAddress=permanentAddress;
    }
}
