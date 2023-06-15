import java.util.ArrayList;
public class ArrayListSubList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        //Adding elements to the list
        list.add("A");      
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        //Printing the subList from index 2 to 7
        System.out.println(list.subList(2, 5));
    }
}
