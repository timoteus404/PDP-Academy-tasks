package collections.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskTwo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Simon");
        names.add("Lola");
        names.add("Sylvanus");
        names.add("Alice");
        names.add("Paris");
        names.add("Norberto");
        names.add("Damien");
        names.add("Saud");
        names.add("Salmin");
        names.add("Rachel");

        System.out.println(names);

        names.set(names.size()-1, "Xolmat");
        names.set(0, "Timur");
        names.set(2, "Yahyayev");
        names.set(3, "Yahyayev");

        System.out.println(names);

        names.toArray();

        names.remove("Timur");
        names.removeAll(Collections.singleton("Yahyayev"));
        System.out.println(names);

    }
}
