package operatorInJava;

import java.util.Scanner;

public class Example2 {
    public static void main(String[]args){
        //TERNARY OPERATOR
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a ternary value");
        int n=input.nextInt();
        int a=9, b=7, c=3;
        int max=(a>b && a>c)? a:b>c?b:c;
        System.out.println(max);
    }
}
