package oopInJava.entity;

import java.util.Objects;

public class SmartPhone extends Phone {
    private final String IMEI;
    private String bodyColor;
    private int RAM;
    private String networkType;

    public SmartPhone(){
        super();
        this.IMEI = "MH2345453";
    }

    public SmartPhone(String IMEI,String bodyColor,int RAM,String networkType){
        super(IMEI+"PHONE"); //ABC123PHONE
        this.IMEI = IMEI; //ABC123
        this.networkType =networkType;
        this.RAM = RAM;
    }

    // Member Function

    @Override
    public void makeCall(){
        System.out.println("Make video call in hd.....");
    }

    @Override
    public String getIMEI(){
        return IMEI;
    }

    public String getBodyColor(){
        return bodyColor;
    }
    public void setBodyColor(String bodyColor){
        this.bodyColor = bodyColor;
    }
    public int getRAM(){
        return RAM;
    }

    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    public String getNetworkType(){
        return networkType;
    }

    public void setNetworkType(String networkType){
        this.networkType = networkType;
    }

    @Override
    public String toString(){
        return "SmartPhone{" +
                "IMEI ='" + IMEI +'\'' +
                ", bodyColor= '" + bodyColor + '\'' +
                ", RAM=" + RAM +
                ", networkType='" + networkType + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),IMEI,bodyColor,RAM,networkType);
    }
}
