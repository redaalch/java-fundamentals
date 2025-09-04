package Polymor;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);
        Animal sacha = new Dog();
//        sacha.makeSound();

        sacha = new Cat();
//        ((Cat)sacha).scratch();

        feed(sacha);
    }
    public static void feed(Animal animal) {
        if(animal instanceof Dog) {
            System.out.println("here is your dog food");
        } else if(animal instanceof Cat) {
            System.out.println("here if your cat food");
        }
    }
}
