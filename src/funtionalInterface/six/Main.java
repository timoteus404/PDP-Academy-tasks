package funtionalInterface.six;

public class Main {

    public static void main(String[] args) {

        Integer[] nums = {23,21,-4};

        Calculate<Integer> sumOfPositiveInt = a -> {
            int res = 0;

            for (Integer i : a) {
                if (i > 0) {
                    res += i;
                }
            }
            return res;
        };

        System.out.println(sumOfPositiveInt.calculate(nums));
    }
}
