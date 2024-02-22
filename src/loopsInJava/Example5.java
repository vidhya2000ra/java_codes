package loopsInJava;

import java.util.Scanner;

public class Example5 {
    public static void main(String[]args){
        //print number from 0 to 10 using for loop
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a print number");
        int num=input.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

    }
}
