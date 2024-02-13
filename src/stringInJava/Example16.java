package stringInJava;
import java.util.Scanner;
public class Example16 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number day");
        int day = input.nextInt();
        int x= 3;
        switch (x){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Common Day");
                break;
        }
    }
}
