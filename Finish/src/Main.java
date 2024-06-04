import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        System.out.println("Задание 1: Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число (b): ");
        int b = scanner.nextInt();
        compareIntegers(a, b);
        performOperations(a, b);

        // Задание 2
        scanner.nextLine(); // consume newline left-over
        System.out.println("Задание 2: Введите первую строку (a): ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку (b): ");
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);

        // Задание 3
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printEvenNumbers(array);
    }

    public static void compareIntegers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void performOperations(int a, int b) {
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление: Деление на ноль невозможно");
        }
    }

    public static void compareStrings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void printEvenNumbers(int[] array) {
        System.out.println("Чётные числа в массиве:");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}