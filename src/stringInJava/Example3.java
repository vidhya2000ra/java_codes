package stringInJava;

import java.net.SocketOption;

public class Example3 {
    public static void main(String[]args){
    String name1 = "Vidhya"; //Literal Pool
    String name2 = new String("vidhya"); //Heap

        //creating string object from char array
        char[] charArray = {'V','i','d','h','y','a'};
        String name3 = new String(charArray);

        int k =2;
        String name4 = new String(charArray,k,charArray.length-k);
        System.out.println(name4);
         byte[] int_Array = { 65,66,67,97,98,99};
         String name5 = new String(int_Array,k,int_Array.length-k);
         System.out.println(name5);
//        System.out.println(name3);

//    System.out.println(name1==name2) ;
    }
}
