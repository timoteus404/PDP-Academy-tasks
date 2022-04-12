package funtionalInterface.seven;

public class Main {

    public static void main(String[] args) {
        Integer[] nums = {23,21, 6, 8, 3, -4};

        Calculate<Integer> sumOfEven = a -> {
            int res = 0;
            for (int i : a) {
                if (i % 2 != 0) {
                    res += i;
                }
            }
            return res;
        };

        System.out.println(sumOfEven.calculate(nums));
    }

}
