package exceptionHandlingInJava;

public class Example8 {
    @Override
    protected void finalize(){
        System.out.println("Finalize Method is called");
    }

    /**
     * This is the basic main entry point method
     * @see
     * @link www.oracle.docs
     * @param args
     * @Since 6/3/24
     * @return void
     */
    public static void main(String[]args){
        Example8 e1= new Example8();
        e1 = null;
        System.gc();
    }
}
