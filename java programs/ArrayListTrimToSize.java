import java.util.*;
public class ArrayListTrimToSize {
    public static void main(String[] args) {

        //ArrayList object creation of size 8.
        ArrayList<String> list = new ArrayList<>(8);

        //Adding elements to the list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        //Printing the initial list.
        System.out.println("ArrayList : " + list);
        
        //Trimming the list to size
        list.trimToSize();

        //Printing the list after trimToSize()
        System.out.println("ArrayList after trimToSize() : " + list);
    }
}
