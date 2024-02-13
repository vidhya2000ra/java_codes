package stringInJava;

public class Example6 {
    public static void main(String[]args){
       int leapYear = 2016;
       if((leapYear % 4==0 && leapYear % 400==0 ) || (leapYear % 100!= 0 && leapYear % 4 ==0)){
           System.out.println("LEAP YEAR");
       }
       else{
           System.out.println("Every YEAR");
       }
    }
}
