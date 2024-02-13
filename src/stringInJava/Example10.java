package stringInJava;

public class Example10 {
    public static void main(String[]args){
        double n1= 15, n2=7, n3= 5;
        if(n1>=n2 && n1>=n3)
        System.out.println(n1 + "Largest Number.");
        else if(n2>= n1 && n2>=n3 )
            System.out.println(n2 +"Largest Number.");
            else
                System.out.println(n3 + "largest Number.");
    }
}
