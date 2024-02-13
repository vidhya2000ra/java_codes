package stringInJava;

import java.util.Scanner;

public class Example13 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("[+]Enter the year : ");
        int nYear = input.nextInt();

        if(nYear%4 == 0){
            if(nYear%100 == 0){
                if(nYear%400 == 0){
                    System.out.println("It is a leap year");
                }else{
                    System.out.println("Not a leap year");
                }
            }else{
                System.out.println("It is a leap year");
            }
        }else{
            System.out.println("Not a leap year");
        }
    }
}
