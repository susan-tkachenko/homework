package lesson5;

public class Employee {

    private final String name;
    private final String position;
    private final String email;
    private final long phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInformation() {
        System.out.println("name = " + name +
                "\nposition = " + position +
                "\nemail = " + email +
                "\nphone = " + phone +
                "\nsalary = " + salary +
                "\nage = " + age
        );
    }

}
