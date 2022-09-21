import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100_000) + 100_000;
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));

                    System.out.println("Задание № 1");
                    int totalSum = 0;
                    for (int i = 0; i < expenses.length; i++) {
                        int expense = expenses[i];
                        totalSum += expense;}
                        System.out.println("Сумма трат за месяц составила " + totalSum + "рублей");
                        System.out.println("Задание № 2");
                        int max = Integer.MIN_VALUE;
                        int min = Integer.MAX_VALUE;
                        System.out.println("Минимальная сумма трат за день составила " + min + "рублей");
                        System.out.println("Максимальная сумма трат за день составила " + max + "рублей");
                        System.out.println("Задание № 3");
                        double midleExpense = (double) totalSum / expenses.length;
                        System.out.println("Средняя сумма трат за месяц составила " + midleExpense + " рублей");
                        System.out.println("Задание № 4");
                        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                            System.out.println(reverseFullName[i]);
                        }
                        return arr;
                        }}








































