package stringInJava;
import java.util.Scanner;
public class Example5 {
    public static void main(String[]args){
       Scanner res= new Scanner(System.in);
       System.out.print("Enter a number");
       int num = res.nextInt();

       if(num % 2 ==0){
       System.out.println(num +"Enter a odd number");
       }else
           System.out.println(num + "Enter a even number");
    }

}
