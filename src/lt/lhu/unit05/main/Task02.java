package lt.lhu.unit05.main;

public class Task02 {
    public static void main(String[] args) {
        int[] mas = new int[]{41, 35, 20};
        int min = findMinValue(mas);
        int max = findMaxValue(mas);
        int sum = findSum (min, max);
        System.out.println("Min=" + min);
        System.out.println("Max=" + max);
        System.out.println("Sum=" + sum);
    }

    public static int findMinValue(int[] numbers) {
        int min;
        min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] numbers) {
        int max;
        max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findSum(int min, int max) {
        int sum;
        sum = min + max;
        return sum;
    }

}
