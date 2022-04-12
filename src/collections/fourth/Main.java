package collections.fourth;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Simon");
        names.add("Lola");
        names.add("Sylvanus");
        names.add("Alice");
        names.add("Paris");
        names.add("April");
        names.add("Damien");
        names.add("Saud");
        names.add("Salmin");
        names.add("Rachel");
        names.add("A");
        names.add("a");

        System.out.println("*********unsorted list*************");
        System.out.println(names);
        System.out.println("*********sorted list*************");
        Collections.sort(names);
        System.out.println(names);
        System.out.println("*********A names deleted list*************");
        names.removeIf(s-> s.startsWith("A") || s.startsWith("a"));
        System.out.println(names);

    }
}
