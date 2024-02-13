package stringInJava;

public class Example7 {
    public static void main(String[]args){
        int num = 20;
        long factorial = 1 ;
        for(int i= 1; i<=num; i++)
        {
            // factorial = factorial*i;
            factorial *=7;
        }
        System.out.printf("Fatorial of %d = %d",num,factorial);
    }
}
