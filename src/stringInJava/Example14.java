package stringInJava;
import java.util.Scanner;


//http:www.godaddy.com
//http:www.google.com
//https:www.instagram.com
public class Example14 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the URL : ");
        String url = input.nextLine();

        String protocol = url.substring(0,url.indexOf(":"));

        String websiteName = url.substring(url.indexOf(".")+1,url.lastIndexOf("."));

        String domain = url.substring(url.lastIndexOf(".")+1);

//        if(protocol == "http"){...}else if (protocol == "https"){}
//        if(protocol == "https"){
//            System.out.println("Enter a https");
//        }
//        else if (protocol == "https"){
//
//        }


    }
}
