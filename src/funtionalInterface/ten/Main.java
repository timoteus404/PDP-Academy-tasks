package funtionalInterface.ten;

public class Main {

    public static void main(String[] args) {

        VowelsCheck countVowels = a -> {

            int sum = 0;
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};

            for (int i = 0; i < a.length(); i++) {

                for (int j = 0; j < vowels.length; j++) {
                    if(a.charAt(i) == vowels[j]){
                        sum++;
                    }
                }

            }
            return sum;

        };

        System.out.println(countVowels.vowelCount("Timur"));
    }
}
