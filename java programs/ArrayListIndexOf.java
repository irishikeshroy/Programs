//This is the Example code for ArraryList IndexOf() Method . 
import java.util.*;
public class ArrayListIndexOf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");       //Adding elements to the list
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println(list.indexOf("A")); //Printing the index of the element "A"
        System.out.println(list.indexOf("B"));
        System.out.println(list.indexOf("C"));
        System.out.println(list.indexOf("D"));
        System.out.println(list.indexOf("E"));
        System.out.println(list.indexOf("F"));
        System.out.println(list.indexOf("G"));
    }
}
