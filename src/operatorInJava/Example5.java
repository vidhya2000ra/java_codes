package operatorInJava;

import java.util.Scanner;

public class Example5 {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a value");
        int num= input.nextInt();
        int a=25;
        int b=30;
        String result= (a > b)?"a is greater than b" : "b is greater than or equal to a";
        System.out.println(result);

    }
}
