package BirinchiDars;

public class MyClass {
    /**
     * Ikkita atribut: firstAtribut va secondAttribut larga ega
     * MyClass nomli klass yarating.
     * Ushbu atributlar qiymatini aboutAttributes,
     * yig’indisini sumAttributes, kattasini maxAttribute
     * ekranga chiqazadigan methodlarini yarating.
     */
    int firstAttribute;
    int secondAttribute;

    public MyClass(int firstAttribute, int secondAttribute) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;
    }

    public void aboutAttributes(){
        System.out.println("Values: \nfirstAttribute = " + firstAttribute + ", secondAttribute = " + secondAttribute);
    }

    public void sumAttributes(){
        System.out.println("Yig'indisi: " + (firstAttribute+secondAttribute));
    }

    public void maxAttribute(){
        //System.out.println(firstAttribute>secondAttribute?firstAttribute:secondAttribute); //optional
        System.out.println("Max Value: " + Math.max(firstAttribute,secondAttribute));
    }

}
