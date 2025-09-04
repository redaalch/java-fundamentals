package Data_structures;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
    }
    public static void setDemo () {
        Set fruit =new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("apple");
        System.out.println(fruit);
    }
}
