package Homework;

public class Phone1 {



    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public void receiveCall(){
            System.out.println("Звонит: " + name);

    }
    private long number;

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }
}
