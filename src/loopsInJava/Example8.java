package loopsInJava;

import java.util.Scanner;

public class Example8 {
    //enter a sum of N number
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sum of number");
        int r=input.nextInt();
        int n=10, sum=0;
        for(int i=1; i<=n; i++)
        {
            sum +=i;
        }
        System.out.println("Enter a sum number=" + sum);
    }
}
