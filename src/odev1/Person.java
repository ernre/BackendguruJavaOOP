package odev1;
import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;
    List<Dog> myDogs;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.myDogs = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void adoptDog(Dog dog) {
        if (dog.getOwner() == null) {
            myDogs.add(dog);
            dog.setOwner(this);
            System.out.println(this.name + " signed the adoption papers for " + dog.getName() + ".");
        } else {
            System.out.println("Sorry, " + dog.getName() + " already belongs to " + dog.getOwner().getName());
        }
    }

    public void feedDog(Dog dog) {
        if (myDogs.contains(dog)) {
            System.out.println(this.name + " pours food into the bowl.");
            dog.eat();
        } else {
            System.out.println("You cannot feed a dog you don't own!");
        }
    }

    public void playFetch(Dog dog) {
        if (myDogs.contains(dog)) {
            System.out.println(this.name + " throws a ball for " + dog.getName() + ".");
            dog.spin(); // Playing causes the dog to move/spin
            dog.bark();
        }
    }
}