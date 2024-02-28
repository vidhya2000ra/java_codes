package enumsInJava;
enum call{
    MOVEMENT("I'm  just looking like a best Movement"){
        @Override
        public void sport(){
//            this.sport="Cricket";
            System.out.println("My best Movement visit to Cricket Stadium");
        }
    },
    POLICE{
        @Override
        public void sport(){
            System.out.println("I call to Police Officer");
        }
        void sport(String name){}
    },
    MAIN_PLAYER{
        @Override
        public void sport(){
            System.out.println("The hat-trick a MainPlayer of the Match");
        }
    };
    String name;
    call(){
        System.out.println("The Sport are very");
    }
    call(String name){
        System.out.println(name);
    }
    abstract void sport();
}
public class Example3{
    public static void main(String[]args){
        call c5 = call.MOVEMENT;
        call c6 = call.MAIN_PLAYER;
        call c7 = call.POLICE;
        System.out.println();

    }
}
