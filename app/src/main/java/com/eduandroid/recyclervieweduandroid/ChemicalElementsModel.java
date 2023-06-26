package com.eduandroid.recyclervieweduandroid;

public class ChemicalElementsModel {
    String elementNameRU;
    String elementNameEN;
    String smallName;

    public String getDescription() {
        return description;
    }

    String description;
    double weight;

    public ChemicalElementsModel(String elementNameRU, String elementNameEN, String smallName, double weight, String desc) {
        this.elementNameRU = elementNameRU;
        this.elementNameEN = elementNameEN;
        this.smallName = smallName;
        this.weight = weight;
        this.description = desc;
    }

    public String getElementNameRU() {
        return elementNameRU;
    }

    public void setElementNameRU(String elementNameRU) {
        this.elementNameRU = elementNameRU;
    }

    public String getElementNameEN() {
        return elementNameEN;
    }

    public void setElementNameEN(String elementNameEN) {
        this.elementNameEN = elementNameEN;
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
