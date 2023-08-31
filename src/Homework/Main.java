package Homework;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.model = 11;
        phone.number = 89275868686L;
        phone.weight = 100;
        phone.info();

        Phone1 phone1 = new Phone1();
        phone1.setName("Игооррьь");
        phone1.receiveCall();

        phone1.setNumber(phone.number);
        System.out.println(phone1.getNumber());

        Phone2 phone2 = new Phone2(phone.model, phone.number, phone.weight);
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());


    }
}