package filehandlingInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example8 {
    public static void main(String[]args) throws IOException,ClassNotFoundException{
        File file= new File("C:/Users/VIDYA/IdeaProjects/javademo/src/filehandlingInJava/data/data2.ser");
        FileInputStream fis = new FileInputStream("C:/Users/VIDYA/IdeaProjects/javademo/src/filehandlingInJava/data/data2.ser");
        ObjectInputStream ois= new ObjectInputStream(fis);

        int data = ois.available();
        System.out.println(data);
    }
}
