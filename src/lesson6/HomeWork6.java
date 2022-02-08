package lesson6;

public class HomeWork6 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Жучка");
        Cat cat1 = new Cat("Муся");

        dog1.run(200);
        dog2.swim(12);
        cat1.run(50);
        cat1.swim(50);

        System.out.println("Созданно " + Cat.getCreatedCats() + " cats");
        System.out.println("Созданно " + Dog.getCreatedDogs() + " dogs");
    }

}
