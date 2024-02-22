package loopsInJava;

import java.util.Scanner;

public class Example10 {
    //Sum of digit number
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Sum of digit number");
        int r=input.nextInt();
        int n= 100, i=1, sum=0 ;
        while (i<=n){
            sum += i; i++;
        }
        System.out.println("Enter a sum =" + sum);
    }
}
