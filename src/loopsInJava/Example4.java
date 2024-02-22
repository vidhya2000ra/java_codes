package loopsInJava;
import java.lang.*;
public class Example4 {
    public static int logBase2(int x){
        int i=5;
        int result=0;
        while (x>1){
            x/=2;
            i++;
        }
        return result;
    }
    public static void main(String[]args){
        int x=8;
        int y = logBase2(x);
        System.out.println(y);
    }
}
