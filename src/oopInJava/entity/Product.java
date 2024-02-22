package oopInJava.entity;

public class Product {
    private String productId;
    private String productName;
    private String description;
    private Float avgRating;

    //Default Constructor

    public  Product (){
        super();
        this.productId="SD123";
        this.productName="Aloevera Soap";
        this.description= "natural moisturizer";
        this.avgRating= 92.23f;
    }
    //get method value string

    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public String getDescription(){
        return description;
    }
    public Float getAvgRating(){
        return avgRating;
    }

    //set method value string
    public void setProductId( ){
        this.productId= productId;
    }
    public void setProductName( ){
        this.productName= productName;
    }
    public void setDescription( ){
        this.description= description;
    }
    public void setAvgRating( ){
        this.avgRating= avgRating;
    }
}
