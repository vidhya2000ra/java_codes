package filehandlingInJava;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[]args)throws IOException {
        byte B[] = "Java Programming Is Funn".getBytes();
        byte B1[] = {34,76,98,56,53,98};

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        FileOutputStream fos = new FileOutputStream("C:/Users/VIDYA/IdeaProjects/javademo/src/filehandlingInJava/data/data1.ser");
        FileOutputStream fos1 = new FileOutputStream("C:/Users/VIDYA/IdeaProjects/javademo/src/filehandlingInJava/data/data2.ser");

        bos.write(B[0]);
        bos.writeTo(fos);
        bos.reset();
        bos.write(B);
        bos.writeTo(fos1);


    }
}
