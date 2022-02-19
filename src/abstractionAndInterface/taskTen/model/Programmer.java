package abstractionAndInterface.taskTen.model;

import abstractionAndInterface.taskTen.service.Human;

public class Programmer extends Human {
    @Override
    public void eat() {
        System.out.println("poorly");
    }

    @Override
    public void sleep() {
        System.out.println("almost never sleeps");
    }

    @Override
    public void walk() {
        System.out.println("sits whole day long");
    }
}
