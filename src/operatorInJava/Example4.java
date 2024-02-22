package operatorInJava;
import java.util.Scanner;

public class Example4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Ternary value");
        int num=input.nextInt();
        int a=50;
        int b=35;
        if(a > b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is less than or equal to a");
        }
        System.out.println();

    }
}
