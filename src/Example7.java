
import java.util.Scanner;
import java.lang.*;
public class Example7 {
    public static void main(String[]args){
         int a=9, b = 12;
         System.out.print("Before swapping, a = " + a + " and b = " + b);
        //swapping a and b using XOR

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.print("After swapping, a = " + a + " and b = " + b);



    }
}
