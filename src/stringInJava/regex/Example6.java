package stringInJava.regex;

import java.util.Scanner;

enum Organization1{
    GOOGLE,
    YAHOO,
    HOTMAIL,
    MICROSOFT,
    OUTLOOK,
    UNKNOWN;
}

public class Example6 {
    public static void main(String[]args){
       Organization1 org;
       Scanner input = new Scanner(System.in);

       System.out.println("[+] Enter a email");
       String res = input.nextLine();
       res = res.trim();

       boolean isValid = false;

       isValid = res.matches("\\w*@gmail.com");
       System.out.println(isValid);

       if(res.matches("\\w*google.com")){
           org = Organization1.GOOGLE;
       }else if(res.matches("\\w*@yahoo.com")){
           org = Organization1.YAHOO;
       }
        if(res.matches("\\w*@microsoft.com")){
            org = Organization1.MICROSOFT;
        }

    }
}
