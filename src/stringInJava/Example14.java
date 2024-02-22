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
        System.out.println(protocol);
        String websiteName = url.substring(url.indexOf(".") + 1, url.lastIndexOf("."));
        System.out.println(websiteName);
        String domain = url.substring(url.lastIndexOf(".") + 1);
        System.out.println(domain);

        if (protocol=="http")
            System.out.println("Its a http protocol:");
        else if (protocol=="http")
            System.out.println("Its a http protocol");
        else if (websiteName=="google")
            System.out.println("Its a google website");
        else if (websiteName=="instagram")
            System.out.println("Its a instagram website");
        else if (domain=="com")
            System.out.println("Its a commercial website");
        else if (domain=="gov")
            System.out.println("Its a government website");
        else if (domain=="in")
            System.out.println("Its a industrial website");
        else{
            System.out.println("INVALID");
        }
    }
}
