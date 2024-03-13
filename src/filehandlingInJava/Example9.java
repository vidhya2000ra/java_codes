package filehandlingInJava;


import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * ByteArrayInputStream Example
 * @author VIDYA
 * @since  8/3/2024
 */
public class Example9 {
    /**
     * Driver method for demonstrating the usage of ByteArrayInputStream
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[]args) throws IOException {
        byte B1[] = {1,2,3,4,5,32,45,56,60,62,79};

        ByteArrayInputStream bis = new ByteArrayInputStream(B1);

        ByteArrayInputStream bis1 = new ByteArrayInputStream(B1,5,4);
        byte b;

        while ((b=(byte)bis1.read())!= -1){
            System.out.print((char)b);
        }

        System.out.println("Printing Another Stream");
        while ((b=(byte) bis1.read()) != -1){
            System.out.println((char)b);
        }
    }
}
