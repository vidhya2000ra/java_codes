package stringInJava.regex;

public class Example8 {
    public static void main(String[]args){

        //Meta Character
        String socialMedia = "$";
        boolean result;

        result = socialMedia.matches("\\w");  //alphabet or number // returns false for special characters// false
        System.out.println(result);

        socialMedia = "5";
        result = socialMedia.matches("\\d");  // to check single symbol as digit //true
        System.out.println(result);

        result = socialMedia.matches("\\D");// false
        System.out.println(result);

        result = socialMedia.matches("\\s");
        System.out.println(result); //false
        result = socialMedia.matches("\\S");
        System.out.println(result); //true

        result = socialMedia.matches("\\w");
        System.out.println(result); //true
        result = socialMedia.matches("\\W");
        System.out.println(result); //false

    }
}
