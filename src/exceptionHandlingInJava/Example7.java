package exceptionHandlingInJava;

/** All user defined Exception Classes Must extends the exception class
 *
 */

class MyException extends Exception{
    @Override
    public String getMessage(){
        return "This is my custom error";
    }

}
class MinBalanceException extends Exception{
    @Override
    public String getMessage(){
//        System.out.println("ewqqqq");
        return "Your Balance should be Rs90 at least";
    }
}

public class Example7 {
    public static void main(String[]args){
        MinBalanceException E2 = new MinBalanceException();
        E2.getMessage();



    }
}
