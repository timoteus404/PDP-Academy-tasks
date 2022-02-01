package polymorphism;

public class AddAttributes {
    /**
     * Quyidagi amallarni bajarib natijasini qaytaruvchi methodlarga ega bo'lgan AddAttributes
     * klassini polymorphismni overloading usulini qo’llagan holda yarating:
     * 1)	int  toifali 2 ta sonlarni qo’shish;
     * 2)	int va double toifali 2 ta sonni qo’shish;
     * 3)	3ta double toifali sonlarni qo’shish;
     * 4)	Ikkita mattni qo’shish;
     * 5)	Son va matni qo’shish.
     */

    public int add(int a, int b){
        return a+b;
    }

    public double add(int a, double b){
        return a+b;
    }

    public double add(double a, double b, double c){
        return a+b+c;
    }

    public String add(String a, String b){
        return a+b;
    }

    public String add(int a, String b){
        return a+b;
    }
}
