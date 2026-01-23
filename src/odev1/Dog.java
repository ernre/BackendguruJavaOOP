package odev1;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private Person owner;
    private int energy;
    private int hunger;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.energy = 100; // Starts fully energetic
        this.hunger = 0;   // Starts not hungry
    }


    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }



    public void bark() {
        System.out.println(name + " (" + breed + ") says: Woof! Woof!");
    }

    public void greetOwner() {
        if (owner != null) {
            System.out.println(name + " wages tail happily at " + owner.getName() + "!");
        } else {
            System.out.println(name + " looks around... but has no owner to greet.");
        }
    }

    public void spin() {
        if (energy > 10) {
            System.out.println(name + " spins in a circle! (Energy -10)");
            energy -= 10;
            hunger += 5;
        } else {
            System.out.println(name + " is too tired to spin...");
        }
    }

    public void sit() {
        System.out.println(name + " sits politely.");
    }

    public void eat() {
        System.out.println(name + " devours the bowl of food.");
        hunger = 0;
        energy += 20; // Food restores energy
        if (energy > 100) energy = 100; // Cap energy at 100
    }

    public void checkStatus() {
        System.out.println("Status of " + name + ": [Energy: " + energy + "/100] [Hunger: " + hunger + "/100]");
    }
}