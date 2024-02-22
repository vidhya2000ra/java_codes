package loopsInJava;

import java.util.Scanner;

public class Example9 {
    public static void main(String[]args){
        //factorial number using for-loop

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a factorial number");
        int  r=input.nextInt();
        int n=10;
        int factorial =1;
        for(int i= 1; i<=n; i++)
        {
            factorial *= i;
        }
        System.out.printf("Factorial number of %d =%d",n,factorial);

    }
}
