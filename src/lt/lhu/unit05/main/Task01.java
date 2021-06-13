package lt.lhu.unit05.main;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        int a, b;
        a = inputIntFromConsole("Введите первое значение: ");
        b = inputIntFromConsole("Введите второе значение: ");
        int res = gcd(a, b);
        int nok = nok(a,b, res);
        System.out.println("HOД=" + res);
        System.out.println("HOK=" + nok);
    }

    public static int inputIntFromConsole(String message) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Неверный ввод. " + message);
        }
        value = sc.nextInt();
        return value;
    }

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a >= b) return gcd(a % b, b);
        return gcd(a, b % a);
    }

    public static int nok (int a, int b, int res) {
        int nok;
        nok = a * b /res;
        return nok;
    }

}
