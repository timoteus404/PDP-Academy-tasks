package funtionalInterface.eight;

public class Main {

    public static void main(String[] args) {

        Integer[] nums = {4,6,2,8,12,7,11,3};

        IsPrime<Integer> primeSum = a ->{
            int result = 0;

            for(int i: a){
                boolean state = isPrime(i);
                if(state){
                    result+=i;
                }
            }
            return result;
        };

        System.out.println(primeSum.sumOfPrime(nums));

    }

    public static boolean isPrime (int number){

        if (number <= 1 || number%2==0) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
