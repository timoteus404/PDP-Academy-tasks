package funtionalInterface.five;

public class Main {

    public static void main(String[] args) {
        Integer[] nums = {23,21,-4};

        Calculate<Integer> sumOfArray = a -> {
            int sum = 0;
            for(Integer i: a){
                sum+=i;
            }
            return sum;
        };

        System.out.println(sumOfArray.calculate(nums));
    }
}
