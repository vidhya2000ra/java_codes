package oopInJava.entity;

public class Example2 {
    public static void main(String[]args){
        Product p= new Product();
        p.setProductId();
        p.setProductName();
        p.setDescription();
        p.setAvgRating();
        System.out.println(p.getProductId());
        System.out.println(p.getProductName());
        System.out.println(p.getDescription());
        System.out.println(p.getAvgRating());
    }
}
