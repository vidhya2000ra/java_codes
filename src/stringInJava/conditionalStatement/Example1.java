package stringInJava.conditionalStatement;

import java.util.Scanner;

class Navigation{
    void run(){
        System.out.println("Running Navigation");
    }
}
class HomeNavigation extends Navigation{
    void run(){
        System.out.println("Running HomeNavigation");
    }
    void run2(){
        System.out.println("Running run 2");
    }
}
class SearchNavigation extends Navigation{
    void run(){
        System.out.println("Running Search Navigation");
    }
}
class ProfileNavigation extends Navigation{
    void run(){
        System.out.println("Running Profile Navigation");
    }
}
public class Example1 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a screen");
        int n=input.nextInt();

        String choice ="Search:screen";
        switch (choice){
            case "Home:screen":
                new HomeNavigation().run();
                break;
            case "Search:screen":
                new SearchNavigation().run();
                break;
            case "Profile:screen":
                new ProfileNavigation().run();
                break;
            default:
                System.out.println("Invalid routes");
                break;

        }
    }

}
