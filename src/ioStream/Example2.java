package ioStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[]args) throws IOException {
        InputStream fis = new FileInputStream("C:/Users/VIDYA/IdeaProjects/javademo/src/ioStream/data/data.csv");
        int c;
        while((c=fis.read()) != -1){
            System.out.println((char)c);
        }
        fis.close();
    }
}
