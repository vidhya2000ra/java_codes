package stringInJava;
import java.util.Scanner;

public class Example17 {
    // calculator numbers
    public static void main(String[]args){
        int a=15;
        int b=10;
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 to addition");
        System.out.println("Press 1 to subtraction");
        System.out.println("Press 1 to multiplication");
        System.out.println("Press 1 to division");
        System.out.println("Press 1 to modulus");
        int  choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("sum:"+(a+b));
                break;
            case 2:
                System.out.println("sub:" + (a-b));
                break;
            case 3:
                System.out.println("multiplication: + (a*b");
                break;
            case 4:
                System.out.println("division: + (a/b)");
                break;
            case 5:
                System.out.println("modulus: + (a%b)");
                break;
            default:
                    System.out.println("Invalid key");
                    break;
        }

    }
}
