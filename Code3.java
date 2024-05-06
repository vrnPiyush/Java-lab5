interface Worker {
    void work();
}

interface Eater {
    void eat();
}

interface Sleeper {
    void sleep();
}

class Human implements Worker, Eater, Sleeper {
    @Override
    public void work() {
        System.out.println("Human is working.");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

public class Code3 {
    public static void main(String[] args) {
        Human human = new Human();
        human.work();
        human.eat();
        human.sleep();
    }
}
