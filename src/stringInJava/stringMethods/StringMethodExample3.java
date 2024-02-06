package stringInJava.stringMethods;

public class StringMethodExample3 {
    public static void main(String[]args){
        String str1= "Welcome to home"; // returns a length
        System.out.println(str1.length());

        //TolowerCase String returns a string with all upper case letters converted to lowercase letters
        String str2= "Learn With Code";
        System.out.println(str2.toLowerCase());

        String str3= "learn with code";
        System.out.println(str3.toUpperCase());// Uppercase

        String str4 = " Learn with code ";//  TrimString leading and trailing whitespace removed
        System.out.println(str3.trim());

        String str5 = "Programming";
        System.out.println(str5.substring(3)); //substring with start
        System.out.println(str5.substring(1,4)); // substring Start and End Index

        String str6 = "Java Program";
        System.out.println(str6.replace('j','r')); //replace
        String str7 = "Tom Jerry";
        System.out.println(str7.replace('t','v'));

        String str8 = "Honey1234545@";
        System.out.println(str8.replaceAll("e","y"));// replaceAll

        String str9 = "JavaLearning";
        System.out.println(str9.startsWith("Java")); //StartsWith //true

        String str10 = "TutorialCode";
        System.out.println((str10.endsWith("Code")));//EndsWith //true

        String str11 = "Old is Gold";
        System.out.println(str11.indexOf('s'));// indexOf //5

        String str12 = "Tutorial Java"; // equals
        String str13 = "Tutorial Java";
        boolean result = str12.equals(str13);
        System.out.println(result);

        String str14 = "Code Java";
        String str15 = "Program Run";
        result = str14.equalsIgnoreCase(str15);
        System.out.println(result); // equalsIgnoreCase

        String str16 = "Code Java";
        String str17 = "Code Java";
        String str18 = "Tom Jerry";
        
        System.out.println(result);
    }
}
