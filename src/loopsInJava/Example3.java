package loopsInJava;
import java.lang.*;
import java.util.Scanner;

public class Example3 {
    public static int logBase2(int x){
       int i=1;
       int result = 0;
      if (x==0){
          return result;
      }
      while (x!=1){
          x=x/2;
          i++;

      }return result;
    }
    public static void main(String[]args){
     int i=5;
     int x=4;
        Scanner input = new Scanner(System.in);
        System.out.println("[+] Enter a logBase2");
        int n=input.nextInt();

        while (x/2<0){
            System.out.println(logBase2(x));
            i++;
        }
        System.out.println("Printing using do-while");
        i =1;
        do{
            System.out.println(i);
            i++;
        }while (x/2<0);
    }
}
