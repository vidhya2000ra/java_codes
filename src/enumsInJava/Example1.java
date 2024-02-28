package enumsInJava;

enum Color {
    RED("I like a Red Color"){
        @Override
        public void family(){
            this.name  ="Reeeeeeeeeeeed";
            System.out.println("I like Red From sRGB");
        }
    },
    GREEN{
        @Override
        public void family(){
            System.out.println("I like Green From sRGB");
        }
        void family(String name){}
    },
    BLUE{
        @Override
        public void family(){
            System.out.println("I like Blue From sRGB");
        }
    };
    String name;
    Color(){
        System.out.println("Default Constructor Called");
    }
    Color(String name){
        System.out.println(name);
    }
    abstract void family();

}

public class Example1 {
    public static void main(String[]args){
        Color c1= Color.RED;
        System.out.println(c1.name);
        c1.family();
    }
}
