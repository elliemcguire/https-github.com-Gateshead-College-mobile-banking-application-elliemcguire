package animals;

public class Dog {
    private String name;
    private String size;
    private String breed;
    private byte age;

    public Dog(String name, String size, String breed, byte age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.age = age;
    }

    public String bark(String size) {
        String bark = "";

        switch (bark.toLowerCase()) {

            case "small":
                return "yap, yap, yap";

            case "medium":
                return "woof, woof";

            case "large":
                return "WOOF WOOF WOOF!";

            default:
                return "error, please tell me the size of your doggo";

        }

    }

//        if (size.equalsIgnoreCase("small")) {
//            bark = "yap yap yap";
//        } else if (size.equalsIgnoreCase("medium")) {
//            bark = "woof woof";
//        } else {
//            bark = "WOOF! WOOF!";
//        }
//
//        return bark;


    public String beHuman (String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old "
                + breed + ", What breed are you?";
    }

    public String play(String breed) {
        String playing = "";

        switch (playing.toLowerCase()) {

            case "Poodle":
                System.out.println("Oh dear, I don't think so, one could not possible engage in such activities");


            case "Labrador":
                System.out.println("Yeah, yeah throw the stick! DO IT!");

            case "Boarder Collie":
                System.out.println("Lets go chase some birds!");

            default:
                return "that breed is not available at the moment, please try again";
        }
    }


//        if(breed.equalsIgnoreCase("Poodle")){
//            return "Oh dear, I don't think so, one could not possible engage in such activities";
//        }
//        else if(breed.equalsIgnoreCase("Labrador")){
//            return "Yeah, Yeah, Throw the stick! Yeah, DO IT!";
//        }
//        else if(breed.equalsIgnoreCase("Boarder Collie")){
//            return "Lets go chase us some sheep!";
//        }
//        return playing;



    public String bark(){
        return null;

    }
    public String jump(){
        return "OK, give me a treat and I will jump";

    }
    public String fetch(){
        return "OK, throw the ball and I will fetch it!";

    }

}
