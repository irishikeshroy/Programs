import java.util.ArrayList;
public class ArrayListSet {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //Adding elements to the list
        list.add("A");      
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        //Printing the elements before replacing.
        System.out.println(list);

        //Trying to replace the element at index 6
        list.set(6, "I");
      
        
    }

}
