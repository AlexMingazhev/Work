public class Main {
    public static void main(String[] agrs) {
        int fifty = 50;
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        int sumPositive = 0;
        int sumNegative = 0;
        double sumAverage = 0;
        int[] arrayInt = new int[fifty];
        for (int i = 0; i < arrayInt.length; i++) {
            int num = (int) (Math.random() * fifty);
            int result = num % 2;
            if(result > 0){
                num = num - fifty;
            }
            arrayInt[i] = num;
        }
        for(int i = 0; i < arrayInt.length; i++) {
            int x = arrayInt[i];

            if (x > 0) {
                sumPositive = sumPositive + x;
                countPositive = countPositive + 1;
            } else if (x < 0) {
                sumNegative = sumNegative + x;
                countNegative = countNegative + 1;
            } else {
                countZero = countZero + 1;
            }
        }
            sumAverage = (double) (sumNegative + sumPositive) / fifty;

        System.out.println("Сумма всех положительных элементов: " + sumPositive);
        System.out.println("Сумма всех отрицательных элементов: " + sumNegative);
        System.out.println("Среднее значение положительных и отрицательных элементов: " + sumAverage);
        System.out.println("Количество положительных элементов: " + countPositive);
        System.out.println("Количество отрицательных элементов: " + countNegative);
        System.out.println("Количество нулей: " + countZero);
    }
}
