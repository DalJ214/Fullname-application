package com.pluralsight;

public class Animal {

    private String type, color, name, gender, taxonomy, blood;

    private int numberOfTeeth, numberOfLegs;

    private double weight;

    public Animal(){
        this.type = "";
        this.color= "";
        this.name = "";
        this.gender = "";
        this.taxonomy = "";
        this.blood = "";
        this.numberOfTeeth = 4;
        this.numberOfLegs = 4;
        this.weight = 0.0;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

}
