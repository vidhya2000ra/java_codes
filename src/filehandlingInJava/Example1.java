package filehandlingInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * ByteArrayInputStream  Example
 * @author VIDYA
 * @since 7/3/24
 */

class MyGeneric<T>{
    T t2;
    T t1;

    void display(){
        System.out.println(t1 +"..." + t2);
    }
}


class Car{
    String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Example1 {
    public static void main(String[]args){
        Car c1 = new Car();
        c1.name = "Swift Desire";
        Car c2 = new Car();
        c2.name = "Verna";

        MyGeneric<Car> mygenClass = new MyGeneric<>();
        mygenClass.t1 = c1;
        mygenClass.t2 = c2;

        mygenClass.display();
// Type Safety At Compile Time
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new LinkedList<>();
        list1.add(12);
//        list1.add("1212");

//        No Type Safety
        List<Object> list3 = new ArrayList<>();
        list3.add(12);
        list3.add("12");
        list3.add(12.12);
        System.out.println(list3);
    }
}
