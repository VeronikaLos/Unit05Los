package lt.lhu.unit05.main;

public class Task04 {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5, 6};
        int sum1 = firstSum(mas);
        int sum2 = seconfSum(mas);
        int sum3 = thirdSum(mas);
        System.out.println("the first Sum = " + sum1);
        System.out.println("the second Sum = " + sum2);
        System.out.println("the third Sum = " + sum3);
    }

    public static int firstSum(int[] mas) {
        int sum1 = 0;
        for (int i = 0; i < mas[2]; i++) {
            sum1 = sum1 + mas[i];
        }
        return sum1;
    }

    public static int seconfSum(int[] mas) {
        int sum2 = 0;
        for (int i = 2; i < mas[4]; i++) {
            sum2 = sum2 + mas[i];
        }
        return sum2;
    }

    public static int thirdSum(int[] mas) {
        int sum3 = 0;
        for (int i = 3; i < mas[5]; i++) {
            sum3 = sum3 + mas[i];
        }
        return sum3;
    }
}
