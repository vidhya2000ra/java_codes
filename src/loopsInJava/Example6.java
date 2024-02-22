package loopsInJava;
import java.lang.*;
import java.util.Scanner;

public class Example6 {
    // print a 0-10 reverse number
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("[+] Enter first 0-10 reverse number");
        int num=input.nextInt();
        for (int i= 10; i>=1; i--){
            System.out.println(i);
        }

    }
}
