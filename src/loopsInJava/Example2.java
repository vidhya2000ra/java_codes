package loopsInJava;

import java.util.Scanner;

public class Example2 {
    public static int twoBaseTox(int x){
        int i=1;
        int result = 1;
        if(x==0){
            return result;
        }
        while (i<=x){
            result = 2 * result;
            i++;
        }
        return  result;
    }
    public static void main(String[]args){
        int i=0;
        Scanner input =new Scanner(System.in);
        System.out.println("[+]Enter a twoBaseTox");
        int n= input.nextInt();

        while (i<=n){
            System.out.println(twoBaseTox(i));
            i++;
        }


    }
}
