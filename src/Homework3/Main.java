package Homework3;

import java.rmi.AlreadyBoundException;

public abstract class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setNumber(89069912644L);
        phone1.setModel(11);
        phone1.setWeight(100);
        phone1.receiveCall("Alex");
        phone1.getNumber();
        phone1.info();


        Phone phone2 = new Phone(89279912645L,12);
        phone2.setWeight(99);
        phone2.receiveCall("Aladin");
        phone2.getNumber();
        phone2.info();

        Phone phone3 = new Phone(89969912646L,13,72);
        phone3.receiveCall("Boba");
        phone3.getNumber();
        phone3.info();
    }

}
