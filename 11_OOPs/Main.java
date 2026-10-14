class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        System.out.println("Parameterized Constructor Called...");
        this.name = name;
        this.salary = salary;
    }

    // Copy Constructor
    Employee(Employee obj) {
        System.out.println("Copy Constructor Called...");
        this.name = obj.name;
        this.salary = obj.salary;
    }

    void details() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Omkar", 50000);
Employee obj2 = new Employee(obj1);

obj2.name = "Pratik";

obj1.details();
obj2.details();
    }
}