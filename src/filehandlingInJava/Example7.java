package filehandlingInJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.*;

public class Example7 {
    public static void main(String[]args)throws IOException{
        File file = new File("C:/Users/VIDYA/IdeaProjects/javademo/src/filehandlingInJava/data/data2.ser");
        FileOutputStream fos= new FileOutputStream(file);
        fos.write("Java May Be Good, But C is Better".getBytes());
        fos.flush();

        byte b[] = {65,66,67};
        fos.write(b);

        fos.close();
    }
}
