package oopInJava.entity;

public class Example3 {
    public static void main(String[]args){
        Employee e = new Employee();
        e.setEmployeeId();
        e.setEmployeeName();
        e.setContact();
        e.setEmail();
        e.setPermanentAddress();
        System.out.println("EmployeeId:" + e.getEmployeeId() + "EmployeeName:"+ e.getEmployeeName() +
                "Contact:" + e.getContact() + "Email:" + e.getEmail() + "PermanentAddress:" + e.getPermanentAddress() );

    }
}
