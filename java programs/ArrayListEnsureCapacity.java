import java.util.*;
public class ArrayListEnsureCapacity {
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
        
        //Ensuring the minimum size of the list so it can hold at least 12 elements.
        list.ensureCapacity(12);

        //Printing the list after ensureCapacity()
        System.out.println("ArrayList after ensureCapacity() : " + list);
    }
}
