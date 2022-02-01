package polymorphism;

public class Calculator {
    /**
     * Quyidagi amallarni bajaruvchi static methodlari bor bo’lgan
     * Calculator classini polymorphismni overloading usulini qo’llagan holda yarating.
     * 1) istalgan toifadagi ikkita sonni yig'indisini qaytaradigan (add) methodi.
     * 2) istalgan toifadagi ikkita sonni ayirmasini qaytaradigan (sub) methodi.
     * 3) istalgan toifadagi ikkita sonni ko’paytmasini qaytaradigan (multiply) methodi.
     * 4) istalgan toifadagi ikkita sonni bo’linmasini qaytaradigan (div) methodi.
     * 5) istalgan toifadagi bitta sonning absolyut qiymatini qaytaradigan (abs) methodi.
     *  6) istalgan toifadagi bitta sonning kvadrat qiymatini qaytaradigan (pow) methodi.
     */
    //additions
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, int b){
        return a+b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    public float add(double a, float b){
        return (float)a+b;
    }

    public float add(int a, float b){
        return a+b;
    }

    public float add(float a, double b){
        return a+(float)b;
    }

    public float add(float a, int b){
        return a+b;
    }

    //subtraction
    public int subtract(int a, int b){
        return a-b;
    }

    public double subtract(double a, int b){
        return a-b;
    }

    public double subtract(int a, double b) {
        return a - b;
    }

    public double subtract(double a, double b){
        return a-b;
    }

    public float subtract(float a, float b){
        return a-b;
    }
    public float subtract(double a, float b){
        return (float) a-b;
    }
    public float subtract(float a, double b){
        return a-(float)b;
    }
    public float subtract(int a, float b){
        return a-b;
    }
    public float subtract(float a, int b){
        return a-b;
    }

    //subtraction
    public int multiply(int a, int b){
        return a*b;
    }

    public double multiply(double a, int b){
        return a*b;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public float multiply(float a, float b){
        return a*b;
    }

    public float multiply(double a, float b){
        return (float)a*b;
    }
    public float multiply(float a, double b){
        return a*(float)b;
    }
    public float multiply(int a, float b){
        return a*b;
    }
    public float multiply(float a, int b){
        return a*b;
    }

    //division
    public int division(int a, int b){
        return a/b;
    }

    public double division(double a, int b){
        return a/b;
    }

    public double division(int a, double b) {
        return a / b;
    }

    public double division(double a, double b){
        return a/b;
    }

    public float division(float a, float b){
        return a/b;
    }

    public float division(double a, float b){
        return (float) a/b;
    }
    public float division(float a, double b){
        return a/(float) b;
    }
    public float division(int a, float b){
        return a/b;
    }
    public float division(float a, int b){
        return a/b;
    }

    //absolute value
    public int abs(int a){
        return Math.abs(a);
    }
    public double abs(double a){
        return Math.abs(a);
    }
    public float abs(float a){
        return Math.abs(a);
    }

    //power of 2
    public int pow(int a){
        return (int)Math.pow(a,2);
    }

    public double pow(double a){
        return Math.pow(a,2);
    }

    public float pow(float a){
        return (float)Math.pow(a,2);
    }
}
