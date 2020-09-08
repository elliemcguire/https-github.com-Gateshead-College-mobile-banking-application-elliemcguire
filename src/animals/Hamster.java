package animals;

public class Hamster {
    private String name;
    private String size;
    private String breed;
    private byte age;

    public Hamster(String name, String size, String breed, byte age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.age = age;
    }

    public String squeak(String size) {
        String squeak = "";

        switch (size.toLowerCase()) {

            case "small":
                return "Squeak";

            case "medium":
                return "Squeak, squeak";

            case "large":
                return "SQUEAK SQUEAK!";

            default:
                return " error, please tell me how big ur hammy is";

        }
    }

//        if (size.equalsIgnoreCase("small")) {
//            return "Squeak";
//        } else if (size.equalsIgnoreCase("medium")) {
//            return "Squeak, squeak";
//        } else if (size.equalsIgnoreCase("large")) {
//            return "Squeak, SQUEAK!";
//        } else {
//            return "Sorry, I seem to have lost my voice!";
//        }


    public String beHuman(String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old "
                + breed + ", What breed are you?";
    }

    public String play(String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("Golden")) {
            return "Oh dear, I don't think so, one could not possible engage in such activities";
        } else if (breed.equalsIgnoreCase("Russian")) {
            return "Yeah, Yeah, bring me the hammy ball!";
        } else if (breed.equalsIgnoreCase("Syrian")) {
            return "Lets do the monkey bars in my cage!";
        }
        return playing;
    }


}

