package Homework;

public class PhoneSpecs {
    private int model;
    private long number;
    private int weight;

    public int getModel() {
        return model;
    }
    public long getNumber() {
        return number;
    }
    public int getWeight() {
        return weight;
    }
    public PhoneSpecs(int model, long number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

}

