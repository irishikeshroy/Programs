import java.util.HashSet;
import java.util.Set;
public class intersectionOfSets {
    
    public static void main(String[] args) {
        //Declaration of set1
        Set<String> set1 = new HashSet<String>();

        //Adding elements to set1
        set1.add("Red");
        set1.add("Green");
        set1.add("Black");
        set1.add("White");
        set1.add("Pink");

        System.out.println("Set1: " + set1);
        
        //Declaration of set2
        Set<String> set2 = new HashSet<String>();

        //Adding elements in set2
        set2.add("Red");
        set2.add("Green");
        set2.add("Black");
        set2.add("Pink");
        System.out.println("Set2: " + set2);
        set1.retainAll(set2);
        System.out.println("Intersection of two sets: " + set1);
    }
}
