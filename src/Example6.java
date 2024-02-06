public class Example6 {
    public static void main(String[]args){
        int a = 27, b = 64;
        // && operator
        System.out.println((a > b) && (a > b));
        System.out.println((a > b) && (a < b));
        // || operator
        System.out.println((a > b) || (a > b));
        System.out.println((a > b) || (a < b));
        System.out.println((a < b) || (a < b));
        // ! operator
        System.out.println(!(a == b));
        System.out.println(!(a > b));
    }
}
