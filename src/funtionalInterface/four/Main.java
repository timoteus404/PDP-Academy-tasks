package funtionalInterface.four;

public class Main {

    public static void main(String[] args) {

        int[] nums = {-1,-10,5,-9,-8,0, 8};

        FindNumberInArray numExists = (a, i) -> {
            boolean result = false;
            for(int num: a){
                if(num == i){
                    return true;
                }
            }
            return result;
        };

        boolean res = numExists.findNumber(nums, 0);
        System.out.println(res);
    }
}
