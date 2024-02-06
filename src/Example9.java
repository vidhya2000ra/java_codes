import java.util.Scanner;
public class Example9 {
    public static void main(String[]args){
        Scanner reader =new Scanner(System.in);
        //odd even oprator

        System.out.print("Enter a number:");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + "Enter number is even");
        else
            System.out.println(num + "Enter number is odd");
    }
}
