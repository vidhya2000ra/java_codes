package lambdaExpressions;


abstract class Service{
    String service_name;
    abstract public void start(String s_name);
    abstract public void pause();
    public int close(){
        return 1;

    }
 static class SpotifyService extends Service{
        @Override
        public void start(String service_name){
            this.service_name =service_name;
            System.out.println("Running:" + this.service_name + "service");
        }
        @Override
        public void pause(){
            this.service_name =service_name;
            System.out.println("Running are" );
        }

    }
}

public class Example6 {
    public static void main(String[]args){
        Service S1 = new Service() {
            @Override
            public void start(String service_name) {
                System.out.println("service are  start");
            }

            @Override
            public void pause() {
                System.out.println("service are pause");
            }

        };
        Service S2 = new Service.SpotifyService();
        S2.start("Spotify");

    }
}
