package hw;

import java.util.Scanner;

public class Main {
    static int user, num, a;

    public static void main(String[] agrs) {

        Scanner s = new Scanner(System.in);

        num = (int) (Math.random() * 100);

        a = 0;

        System.out.println("Угадай число от 1 до 100");

        while (true) {
            System.out.println("Введите число : ");
            user = s.nextInt();

            if (user == num) {
                System.out.println("Угадал это  - " + num);
                break;
            } else {
                int diff = a;
                a = Math.abs(user - num);

                if (diff > a) {
                    if (a > 10) {
                        System.out.println("Горячо!");
                    } else {
                        System.out.println("Очень горячо!");
                    }
                } else {
                    if (a < 10) {
                        System.out.println("Холодно!");
                    } else {
                        System.out.println("Очень холодно!");
                    }

                }

            }
        }
    }
}
