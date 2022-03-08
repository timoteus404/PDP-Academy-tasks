package funtionalInterface;

import funtionalInterface.three.FindNumberInArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        DefineSign defineSign = (a) -> a>=0?"Musbat":"Manfiy";
//        System.out.println(defineSign.sign(2));

//        NumberCompaprator findBiggerNumber = Math::max;
//        System.out.println(findBiggerNumber.compare(5,-5));

        int[] nums = {-1,-10,5,-9,-8,0, 8};
        FindNumberInArray biggestInArray = new FindNumberInArray() {

            @Override
            public int findNumber(int[] a) {
                int result =a[0];
                for(int i:a){
                    if(result<i){
                        result = i;
                    }
                }
                return result;
            }
        };

        System.out.println(biggestInArray.findNumber(nums));


    }
}
