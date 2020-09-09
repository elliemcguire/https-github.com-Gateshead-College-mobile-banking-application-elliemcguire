package animals;

import java.util.Scanner;

public class CreateAnimal {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        CreateAnimal animals = new CreateAnimal();
        animals.getAnimalType();
    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        switch (animal.toLowerCase()) {
            case "dog" -> createDog();
            case "cat" -> createCat();
            case "fish" -> createFish();
            default -> {
                System.out.println(animal + " is not a type of animal we can currently create, please try again");
                getAnimalType();
            }
        }





//    if(animal.equalsIgnoreCase( "dog")){
//        createDog();
//    }
//    else if(animal.equalsIgnoreCase("cat")){
//        createCat();
//    }
//    else if (animal.equalsIgnoreCase("hamster")){
//        createHamster();
//
//    }
//    else if (animal.equalsIgnoreCase("fish")){
//        createFish();
//
//    }
//    else {
//        System.out.println(animal + " is not an animal we can currently create, please try again");
//    }
    }

    private void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        byte age = myScanner.nextByte();
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        Dog myDog = new Dog(name, size, breed, age);

        System.out.println();
        myDog.bark(size);
        System.out.println();
        myDog.play(breed);
        System.out.println();
        myDog.beHuman(name, age, breed);

    }

    private void createCat() {
        System.out.println("What is the cats name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the cat?");
        String size = myScanner.nextLine();
        System.out.println("How old is the cat?");
        byte age = myScanner.nextByte();
        System.out.println("What breed is the cat?");
        String breed = myScanner.nextLine();
        Cat myCat = new Cat(name, size, breed, age);

        System.out.println();
        myCat.meow(size);
        System.out.println();
        myCat.play(breed);
        System.out.println();
        myCat.beHuman(name, age, breed);

    }

    private void createHamster() {
        System.out.println("What is the hamsters name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the hamster?");
        String size = myScanner.nextLine();
        System.out.println("How old is the hamster?");
        byte age = myScanner.nextByte();
        System.out.println("What breed is the hamster?");
        String breed = myScanner.nextLine();
        Hamster myHamster = new Hamster(name, size, breed, age);

        System.out.println();
        myHamster.squeak(size);
        System.out.println();
        myHamster.play(breed);
        System.out.println();
        myHamster.beHuman(name, age, breed);
    }

    private void createFish() {
        System.out.println("What is the fish name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the fish?");
        String size = myScanner.nextLine();
        System.out.println("How old is the fish?");
        byte age = myScanner.nextByte();
        System.out.println("What breed is the fish?");
        String breed = myScanner.nextLine();
        Fish myFish = new Fish(name, size, breed, age);

        System.out.println();
        myFish.bubble(size);
        System.out.println();
        myFish.play(breed);
        System.out.println();
        myFish.beHuman(name, age, breed);
    }

}
