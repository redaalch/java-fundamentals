package streams;

import java.util.List;

public class StreamOperations {
    static List<String> veggies = List.of(
           "spinach",
           "cabbage",
           "peas",
           "carrots",
           "beans"
    );

    public static void main(String[] args) {
//        anyMatchDemo();
//        allMatchDemo();
//        filterDemo();
//        mapDemo();
//        reduceDemo();
        collectDemo();
        powerOfAll();
    }
    public static void  anyMatchDemo() {
        boolean anyMatches = veggies.stream().anyMatch(v->v.contains("p"));
        System.out.println(anyMatches);
    }
    public  static void allMatchDemo() {
        boolean allMatches = veggies.stream().allMatch(v-> v.contains("a"));
        System.out.println(allMatches);
    }
    public static void filterDemo() {
         veggies.stream()
                 .filter(v-> v.contains("c"))
                 .forEach(System.out::println);

    }
    public static void mapDemo() {
        veggies.stream().map(String::toUpperCase).forEach(System.out::println);

    }
    public static void reduceDemo() {
        System.out.println(veggies.stream().sorted()
                .reduce("",(a,b)->a+" | "+b));
    }
    public static void intReduceDemo() {
        List<Integer> numbers = List.of(1,2,5,8,9,10);
        numbers.stream().reduce(0, Integer::sum);
    }
    public static void collectDemo() {
      List<String> veggiesEnding =  veggies.stream()
                .filter(v-> v.endsWith("s")).toList();
      veggiesEnding.forEach(System.out::println);
    }
    public static void powerOfAll() {
        veggies.stream()
                .sorted()
                .filter(v->v.startsWith("c"))
                .map(String::toUpperCase)
                .map(v->v.transform(w->"yummy "+w))
                .forEach(System.out::println);
    }
}
