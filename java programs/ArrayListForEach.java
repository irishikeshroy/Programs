import java.util.*;
public class ArrayListForEach {
    public static void main(String[] args) {
        
        //ArrayList object creation
        ArrayList<String> list = new ArrayList<>();

        //Adding elements to the list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        //Printing the initial list.
        System.out.println("ArrayList : " + list);

        //Using forEach() method to iterate through the list.
        list.forEach((n) -> System.out.println(n));
    }
}
