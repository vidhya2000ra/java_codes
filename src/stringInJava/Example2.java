package stringInJava;

public class Example2 {
    public static void main(String[]args){

        String name1="Vidhya";
        String name2= new String("Vidhya");
        String name3Intern = name2.intern();
        System.out.println("LIteral compare object" + name1== name2);
        System.out.println(name3Intern == name1);
    }
}
