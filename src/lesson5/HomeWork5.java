package lesson5;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivan", "QA Engineer", "ivivan@mailbox.com",
                892312312L, 72000, 39);
        employees[1] = new Employee("Anastasia", "Designer", "anastasia@mail.ru",
                87653214141L, 60000, 25);
        employees[2] = new Employee("Peter", "Developer", "peter@mail.ru",
                83216549887L, 90000, 42);
        employees[3] = new Employee("Andrew", "Developer", "andrew@mail.ru",
                89638521478L, 95000, 28);
        employees[4] = new Employee("Anna", "QA Engineer", "anna@mail.ru",
                87418523696L, 45000, 26);

        printEmployeesOlderThan(employees, 40);
    }

    public static void printEmployeesOlderThan(Employee[] employees, int fromAgeExclusive) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > fromAgeExclusive) {
                employees[i].printInformation();
            }
        }
    }

}



