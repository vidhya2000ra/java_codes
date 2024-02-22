package loopsInJava;

import java.util.Scanner;
// cube  number
public class Example11 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a cube number");
        int n=input.nextInt();
        int cube= n*n*n;
        System.out.println("Cube of number"+ n +"is"+cube);
    }
}
