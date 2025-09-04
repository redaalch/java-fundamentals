package Abstract;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(40,50);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
