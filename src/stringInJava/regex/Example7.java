package stringInJava.regex;

public class Example7 {
    public static void main(String[]args){

        //Single Character Regex
        String str2 = "a";
        boolean result = str2.matches(".");
        System.out.println(result);

        result = str2.matches("[abc]");
        System.out.println(result);

        result = str2.matches("[abc][vz]");
        System.out.println(result);


        result = str2.matches("[123][76]");//true
        System.out.println(result);

        result = str2.matches("[^abc]");
        System.out.println(result);

        result = str2.matches("[a-z1-7]");
        System.out.println(result);
        result = str2.matches("[a-z3-8]");// true
        System.out.println(result);
        result = str2.matches("[A-z5-9]");// true
        System.out.println(result);
        result = str2.matches("[A-z4-5]");// true
        System.out.println("The symbol is between A-Z or 0-9:" + result);// true

        result = str2.matches("[A|B]");
        System.out.println((result));

        result = str2.matches("AB");
        System.out.println(result);
    }
}
