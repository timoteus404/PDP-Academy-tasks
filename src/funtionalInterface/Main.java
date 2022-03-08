package funtionalInterface;

import funtionalInterface.four.FindNumberInArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        DefineSign defineSign = (a) -> a>=0?"Musbat":"Manfiy";
//        System.out.println(defineSign.sign(2));

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
        int[] nums = {-1,-10,5,-9,-8,0, 8};
        FindNumberInArray numExists = new FindNumberInArray() {
            @Override
            public boolean findNumber(int[] a, int i) {
                boolean result = false;
                for(int num: a){
                    if(num == i){
                        return true;
                    }
                }
                return result;
            }
        };

        boolean res = numExists.findNumber(nums, 0);
        System.out.println(res);
    }
}
