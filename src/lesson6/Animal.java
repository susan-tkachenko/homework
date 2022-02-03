package lesson6;

public class Animal {

    protected final String name;
    private final int maxRunDistance;
    private final int maxSwimDistance;

    protected Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (maxRunDistance == 0) {
            System.out.println(name + " не умеет бегать.");
        } else if (distance > maxRunDistance) {
            System.out.println(name + " не может пробежать " + distance + " м.");
        } else {
            System.out.println(name + " пробежал(а) " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance > maxSwimDistance) {
            System.out.println(name + " не может проплыть " + distance + " м.");
        } else {
            System.out.println(name + "проплыл(а) " + distance + " м.");
        }
    }

}
