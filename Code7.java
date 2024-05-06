abstract class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract void work();

    public void rest() {
        System.out.println(name + " is resting.");
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

class Worker extends Employee {
    private int hoursWorked;

    public Worker(String name, int age, double salary, int hoursWorked) {
        super(name, age, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void work() {
        System.out.println(name + " is working for " + hoursWorked + " hours.");
    }
}

public class Code7 {
    public static void main(String[] args) {
        Manager manager = new Manager("Rahul", 35, 5000, "Sales");
        Worker worker = new Worker("Suraj", 28, 3000, 8);

        manager.work();
        manager.rest();

        worker.work();
        worker.rest();
    }
}
