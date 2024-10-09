package com.pluralsight;

public class CellPhone {

    private String carrier, model, owner, phoneNumber;

    private int serialNumber;

    public CellPhone(){
        this.carrier = "";
        this.model = "";
        this.owner = "";
        this.serialNumber = 0;
        this.phoneNumber = "";
    }
    public String getCarrier(){
        return this.carrier;

    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
}
