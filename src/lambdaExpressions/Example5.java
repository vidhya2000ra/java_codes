package lambdaExpressions;

@FunctionalInterface
interface console{
    int run();
}
class NintendoCD{
    String data;
    public int run(){
        return 1;
    }
}

class ConsoleRunner implements  console {
    String gameData;
    void setGameData(String data){
        this.gameData=data;
    }

    @Override
    public int run() {
        System.out.println("Running Nintendo game directly");
        return 0;
    }
    ConsoleRunner(String data){
        this.setGameData(data);
    }


    }


public class Example5 {
    public static void main(String[] args) {
       console c1= new console() {
           @Override
           public int run() {
               return 0;
           }
       };
       NintendoCD game = new NintendoCD();
       console c = new ConsoleRunner("gameData");
       c.run();
    }
}
