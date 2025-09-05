package Data_structures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//       queueDemo();
        mapDemo();
    }

    public static void mapDemo() {
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("lemon",45);
        fruitCalories.put("banana",105);
        fruitCalories.putIfAbsent("orange",45);
        fruitCalories.remove("lemon");

        for (Map.Entry calorieINfo : fruitCalories.entrySet()) {
            System.out.println(calorieINfo.getKey()+ ": " + calorieINfo.getValue());
        }
        fruitCalories.forEach((k,v)-> System.out.println(k +": "+v)) ;
        System.out.println(fruitCalories);
        System.out.println("banana calories "+fruitCalories.get("banana"));
        System.out.println("contains orange? "+fruitCalories.containsKey("orange"));
        Map immutableFruit = Map.of(
                "apple",95,
                "lemon",100
        );
    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits);
        fruits.add("lemon");
        var removed = fruits.remove();
        System.out.println("removed "+removed);
        System.out.println("head of queue: "+fruits.peek());
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        fruits.forEach(ele -> System.out.println(ele));
        fruits.set(2,"grape");
        fruits.add("lemon");
        fruits.remove("lemon");
        fruits.remove(3);

        System.out.println(fruits);
        System.out.println("index 2 "+fruits.get(2));
        System.out.println("grape : "+fruits.indexOf("grape"));

        List moreFruit = List.of("cherry","plum");
        System.out.println(moreFruit);
    }

    public static void setDemo () {
        Set fruit =new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("lemon");
        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(fruit);
        fruit.remove("lemon");
        System.out.println("contains lemon? "+ fruit.contains("lemon"));
        System.out.println("size : "+fruit.size());

        Set moreFruit = Set.of("pear","raisin","cherry") ;


    }
}
