package multithreadingInJava;
import java.util.Date;
public class Example1 {
    public static void main(String[]args){
        long time1 = new Date().getTime();
        for (int i=0; i<10000000; i++);
        {
            System.out.println("Java");
        }
        for (int i=0; i<10000000; i++);
        {
        System.out.println("Python");
        }
        long time2 = new Date().getTime();
        System.out.println("Total time :" +(time2-time1));
    }


}
