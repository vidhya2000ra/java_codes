package annotationsInJava;

abstract class Parent{
    abstract public void display();
}

class Child extends Parent{
    @Override
    public void display(){
        System.out.println("Yes Hey Display");
    }
}

class ForcedAbstract{
    public void display(){
        System.out.println("Original Display Method");
    }
}

class ForcedChildOverride extends ForcedAbstract{
    @Override
    public void display(){
        System.out.println("Override Display Method");
    }
}

public class Example2 {
    public static void main(String[]args){
        ForcedChildOverride f2= new ForcedChildOverride();
        System.out.println();

    }
}
