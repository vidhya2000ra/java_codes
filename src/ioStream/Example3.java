package ioStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *  This example is all about OutputStream classes in java
 * @
 * @author VIDYA
 * @since 6/3/24
 * @see java.io.OutputStream
 */

public class Example3 {
    public static void main(String[]args)throws Exception{
        String name = "Vidhya";
        String company = "Capgemini";
        String city = "Pune";
        String lang = "Java";

        OutputStream fos = new FileOutputStream("C:/Users/VIDYA/IdeaProjects/javademo/src/ioStream/data/data.csv");
//        fos.write(name.charAt(0));
//
//        byte[] buff = name.getBytes();
//        System.out.println(buff);
//        for(byte b: buff){
//            System.out.println((char)b);
//        }

        System.out.println("Enter a name,company,city and lang:");
        Scanner input = new Scanner(System.in);
        String result = input.nextLine();

        fos.write(result.getBytes());
        fos.flush();

        fos.close();

    }
}
