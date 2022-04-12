package funtionalInterface;

import funtionalInterface.one.DefineSign;

public class Main {

    public static void main(String[] args) {
        //First Task
        DefineSign defineSign = (a) -> a>=0?"Musbat":"Manfiy";
        System.out.println(defineSign.sign(2));

//        NumberCompaprator findBiggerNumber = Math::max;
//        System.out.println(findBiggerNumber.compare(5,-5));

//        int[] nums = {-1,-10,5,-9,-8,0, 8};
//        FindNumberInArray biggestInArray = new FindNumberInArray() {
//
//            @Override
//            public int findNumber(int[] a) {
//                int result =a[0];
//                for(int i:a){
//                    if(result<i){
//                        result = i;
//                    }
//                }
//                return result;
//            }
//        };
//        System.out.println(biggestInArray.findNumber(nums));
//        int[] nums = {-1,-10,5,-9,-8,0, 8};
//        FindNumberInArray numExists = new FindNumberInArray() {
//            @Override
//            public boolean findNumber(int[] a, int i) {
//                boolean result = false;
//                for(int num: a){
//                    if(num == i){
//                        return true;
//                    }
//                }
//                return result;
//            }
//        };
//
//        boolean res = numExists.findNumber(nums, 0);
//        System.out.println(res);
//
//        Integer[] nums = {23,21,-1,-10,5,-9,-8,0, 8,7,11};
//        Calculate<Integer> sumOfArray = a -> {
//            int sum = 0;
//            for(Integer i: a){
//                sum+=i;
//            }
//            return sum;
//        };
//
//        Calculate<Integer> sumOfPositiveInt = a -> {
//            int res = 0;
//
//            for (Integer i : a) {
//                if (i > 0) {
//                    res += i;
//                }
//            }
//            return res;
//        };
//
//        Calculate<Integer> sumOfEven = a -> {
//            int res = 0;
//            for (int i : a) {
//                if (i % 2 != 0) {
//                    res += i;
//                }
//            }
//            return res;
//        };
//
//        Calculate<Integer> sumOfPrimeNumbers = a -> {
//            int sum = 0;
//            for(Integer i: a){
//                if(CheckingPrimeNumbers.isPrime(i)){
//                    sum+=i;
//                }
//            }
//          return sum;
//        };
//
//
//
//        System.out.println(sumOfArray.calculate(nums));
//        System.out.println(sumOfPositiveInt.calculate(nums));
//        System.out.println(sumOfEven.calculate(nums));
//        System.out.println(sumOfPrimeNumbers.calculate(nums));
//
//        StringCheck doesExists = AdditionalMethods::isHere;
//        System.out.println(doesExists.doesExists("Timur", "p"));
//
//        VowelsCheck checkingVowels = a->{
//            int sum = 0;
//            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//
//            for (int i = 0; i < a.length(); i++) {
//
//                for (int j = 0; j < vowels.length; j++) {
//                    if(a.charAt(i) == vowels[j]){
//                        sum++;
//                    }
//                }
//
//            }
//            return sum;
//        };
//        System.out.println(checkingVowels.vowelCount("oooteemriiii"));

    }
}
