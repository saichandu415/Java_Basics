package com.training.basics;

public class TestAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal dog = new Animal("Dog", 1, 15);
        Animal elephant = new Animal("Elephant", 10, 50);

        System.out.println(dog);
        System.out.println(elephant);
        System.out.println(dog.equals(elephant));

        // IS-A & HAS-A
        EmployeeNecessities manager = new Manager();
        System.out.println(manager.getWorkTimings());

    }
}
