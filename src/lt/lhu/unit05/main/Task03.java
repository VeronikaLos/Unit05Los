package lt.lhu.unit05.main;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        int a = generateNumbersA();
        int b = generateNumbersB();
        int countNumeralA = countNumeralA(a);
        int countNumeralB = countNumeralB(b);
        int findBiggerNumerals = findBiggerNumerals(countNumeralA, countNumeralB, a, b);
    }

    public static int generateNumbersA() {
        Random rand = new Random();
        int a = rand.nextInt(1000000);
        System.out.println("NumberA = " + a);
        return a;
    }

    public static int generateNumbersB() {
        Random rand = new Random();
        int b = rand.nextInt(10000000);
        System.out.println("NumberB = " + b);
        return b;
    }


    public static int countNumeralA(int a) {
        int countOfNumeralsA = 0;
        while (a > 0) {
            a = a / 10;
            countOfNumeralsA++;
        }
        System.out.println("Quantity of numerals in number A = " + countOfNumeralsA);
        return countOfNumeralsA;
    }

    public static int countNumeralB(int b) {
        int countOfNumeralsB = 0;
        while (b > 0) {
            b = b / 10;
            countOfNumeralsB++;
        }
        System.out.println("Quantity of numerals in number B = " + countOfNumeralsB);
        return countOfNumeralsB;
    }

    public static int findBiggerNumerals(int countNumeralA, int countNumeralB, int a, int b) {
        int findBiggerNumerals = 0;
        if (countNumeralA >= countNumeralB) {
            findBiggerNumerals = a;
        }
        if (countNumeralA < countNumeralB) {
            findBiggerNumerals = b;
        }
        System.out.println("Number with the bigger quantity of numerals = " + findBiggerNumerals);
        return findBiggerNumerals;
    }

}
