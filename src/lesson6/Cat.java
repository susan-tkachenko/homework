package lesson6;

public class Cat extends Animal {

    private static int createdCats = 0;

    public Cat(String name) {
        super(name, 200, 0);
        createdCats++;
    }

    public static int getCreatedCats() {
        return createdCats;
    }

}
