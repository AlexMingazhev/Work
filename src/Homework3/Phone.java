package Homework3;

public class Phone {
    private long number;
    private int model;
    private int weight;

    public Phone(){}

    public Phone(long number, int model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, int model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }


    public void setNumber(long number) {
        this.number = number;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void info(){
        System.out.printf("Number: %d \nModel: %d \nWeight: %d \n\n", number,model,weight);
    }

    public void receiveCall (String name){
        System.out.printf("Звонит: %s \n" , name);
    }

    }


