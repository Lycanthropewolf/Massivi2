import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] days = generateRandomArray();


        //Задание 1
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        System.out.println(" сумма всех затрат за месяц составила " + sum +" рублей.");

        // Задание 2
        int maxPayment = 100_000;
        int minPayment = 200_000;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxPayment) {
                maxPayment = days[i];
            } else if (days[i] < minPayment) {
                minPayment = days[i];
            }
        }System.out.println("Минимальная сумма затрат составила " + minPayment + " рублей." + " Максимальная сумма затрат составила " + maxPayment + " рублей.");
        System.out.println();

        // Задание 3

            double averagePaymentAmount = (double)sum / days.length;
            System.out.println(averagePaymentAmount);


        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int m = reverseFullName.length - 1; m >= 0; m--) {
            System.out.print(reverseFullName[m]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] days = new int[30];
        for (int i = 0; i < days.length; i++) {
            days[i] = random.nextInt(100_000) + 100_000;
        }
        return days;
    }

}


















