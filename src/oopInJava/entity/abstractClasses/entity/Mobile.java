package oopInJava.entity.abstractClasses.entity;

public class Mobile implements Camera,MusicPlayer{
    public String play(){
        return "Rashiya.....Song is Playing";
    }
    public void pause(){
        System.out.println("Kishor Kumar Song is Paused");
    }
    @Override
    public String next(){
        return "Playing Chand Tare";
    }
    @Override
    public String previous(){
        return " Playing previous Chaiya Chaiya.....";
    }
    @Override
    public void clickPicture(){
        System.out.println("Clicking Picture");
    }

    @Override
    public String recordVideo(){
        return "Recording started.....";
    }

}
