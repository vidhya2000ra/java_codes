import java.util.Scanner;
public class Example8 {
   public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       //bitwise odd even oprator
       long n=sc.nextLong();
       if((n&1)==0)
           System.out.print("Enter the even number");
       else
           System.out.print("Enter the odd number");
   }
}
