package collections.hashsetinterface.first;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Ichida String toifasidagi elementlarni saqlaydigan set yarating va ichiga 10 ta element kiriting
        HashSet<String> stringSet = new HashSet<>(10);
        stringSet.add("something");
        stringSet.add("somewhere");
        stringSet.add("somehow");
        stringSet.add("sometime");
        stringSet.add("some");
        stringSet.add("elsewhere");
        stringSet.add("where");
        stringSet.add("where ever");
        stringSet.add("whenever");
        stringSet.add("whatever");

        //Set barcha elementlarini iterator orqali ekranga chiqazing
        Iterator<String> iterator = stringSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("*********forEach**********");
        //Set barcha elementlarini forEach methodi orqali ekranga chiqazing

        stringSet.forEach(System.out::println);

    }
}
