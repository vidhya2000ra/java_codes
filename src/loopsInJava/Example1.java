package loopsInJava;
import java.lang.*;
import java.util.Scanner;

public class Example1 {
    public static void main(String[]args){
        // Variable and Declaration and Object References
        int n;
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("[+]Enter the value of n to print series");
        n = input.nextInt();
        //0-----n
        while (i <= n){
            System.out.println(1);
            i++;// updation part
        }
        System.out.println("Printing using do-while");
        i =0;
        do{
            System.out.println(i);
            i++;
        }while (i <=5);


    }
}
