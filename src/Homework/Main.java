package Homework;

public class Main {
    public static void main(String[] args) {
        BasicPhone phone = new BasicPhone();
        phone.model = 11;
        phone.number = 89275868686L;
        phone.weight = 100;
        phone.displayInfo();

        CallablePhone phone1 = new CallablePhone();
        phone1.setName("Игорь");
        phone1.receiveCall();

        phone1.setNumber(phone.number);
        System.out.println(phone1.getNumber());

        PhoneSpecs phone2 = new PhoneSpecs(phone.model, phone.number, phone.weight);
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());


    }
}