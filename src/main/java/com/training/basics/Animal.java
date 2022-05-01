package com.training.basics;

// javatpoint
// Telsuko
public class Animal {

    // POJO - Plain Old Java Objects / Model

    // Attributes / Properties
    private String type;
    private int weight;
    private int lifetime;

    public Animal() {
        this.type = "Human";
        this.weight = 60;
        this.lifetime = 100;
    }

    public Animal(String type, int weight, int lifetime) {
        this.type = type;
        this.weight = weight;
        this.lifetime = lifetime;
    }

    // Methods / Behaviours

    // Getters
    public String getType() {
        return type;
    }

    // Setters
//    public void setType(String type) {
//        this.type = type;
//    }

    public int getWeight() {
        return weight;
    }

//    public void setWeight(int weight) {
//        this.weight = weight;
//    }

    public int getLifetime() {
        return lifetime;
    }

//    public void setLifetime(int lifetime) {
//        this.lifetime = lifetime;
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", lifetime=" + lifetime +
                '}';
    }
}
