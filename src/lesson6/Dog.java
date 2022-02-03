package lesson6;

public class Dog extends Animal {

    private static int createdDogs = 0;

    public Dog(String name) {
        super(name, 500, 10);
        createdDogs++;
    }

    public static int getCreatedDogs() {
        return createdDogs;
    }

}
