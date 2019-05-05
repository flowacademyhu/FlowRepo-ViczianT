import animals.Animal;
import animals.Dog;

public class Main {
    public static void main(String... args) {
        Animal animal = new Animal("Jackson", (byte)8, "Black-Wgite", 13.1f);
        System.out.println(animal.getName() + " : " + animal.getAge());

        Dog dog = new Dog();

        System.out.println(dog.getName());
    }
}
