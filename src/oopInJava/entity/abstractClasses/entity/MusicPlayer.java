package oopInJava.entity.abstractClasses.entity;

public interface MusicPlayer {

        String play();
        public abstract void pause();
        String next();
        String previous();

        default void musicPlayerVersion(){
            System.out.println("15.15.0.15");
        }

}
