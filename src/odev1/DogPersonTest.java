package odev1;

public class DogPersonTest {
    public static void main(String[] args) {

        Person owner = new Person("Sarah", 28);
        Person stranger = new Person("Mr. Smith", 40);


        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);


        owner.adoptDog(myDog);

        System.out.println("\n--- Interaction 1: Greeting ---");
        myDog.greetOwner();

        System.out.println("\n--- Interaction 2: Playing triggers status change ---");
        myDog.checkStatus();
        owner.playFetch(myDog);
        owner.playFetch(myDog);
        myDog.checkStatus();

        System.out.println("\n--- Interaction 3: Refusing to spin when tired ---");
        for(int i = 0; i < 8; i++) {
            myDog.spin();
        }
        myDog.spin();

        System.out.println("\n--- Interaction 4: Recovery ---");
        owner.feedDog(myDog);
        myDog.checkStatus();
    }
}
