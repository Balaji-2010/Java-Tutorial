public class array {
    public static void main(String[] args) {
        int[] numbers = {10, 30, 50, 120, 20};
        int max_value = Max_array(numbers);
        int min_value = Min_array(numbers);
        System.out.println(max_value);
        System.out.println(min_value);
    }


    public static int Max_array(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }


    public static int Min_array(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }
}