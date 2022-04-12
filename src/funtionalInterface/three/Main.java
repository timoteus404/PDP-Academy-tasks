package funtionalInterface.three;

public class Main {

    public static void main(String[] args) {

        int[] nums = {-1,-10,5,-9,-8,0, 8};

        FindNumberInArray biggestInArray = a -> {
            int result =a[0];
            for(int i:a){
                if(result<i){
                    result = i;
                }
            }
            return result;
        };

        System.out.println(biggestInArray.findNumber(nums));
    }
}
