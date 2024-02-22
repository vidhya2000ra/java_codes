package loopsInJava;

import java.util.Scanner;

public class Example7 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Multiplication table");
        int r=input.nextInt();
        int num=10;
        for(int i= 0; i<=10 ; i++);
        {
            System.out.printf("%d * %d = %d \n", num, r, num * r);
        }
    }
}
