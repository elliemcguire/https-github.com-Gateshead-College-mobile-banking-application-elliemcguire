package animals;

public class Fish {
    private String name;
    private String size;
    private String breed;
    private byte age;

    public Fish(String name, String size, String breed, byte age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.age = age;
    }

    public String bubble(String size) {
        String bubble = "";

        switch (size.toLowerCase()) {

            case "small":
                return "Bubble";

            case "medium":
                return "Bubble, bubble";

            case "large":
                return "BUBBLE BUBBLE!";

            default:
                return "error, please tell me how big you fishy is";

        }

    }
//        if (size.equalsIgnoreCase("small")) {
//            return "Bubble";
//        } else if (size.equalsIgnoreCase("medium")) {
//            return "Bubble, bubble";
//        } else if (size.equalsIgnoreCase("large")) {
//            return "Bubble, BUBBLE!";
//        } else {
//            return "Sorry, I seem to have lost my voice!";
//        }


    public String beHuman(String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old "
                + breed + ", What breed are you?";
    }

    public String play(String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("Goldfish")) {
            return "Oh dear, I don't think so, one could not possible engage in such activities";
        } else if (breed.equalsIgnoreCase("Clownfish")) {
            return "Yeah, Yeah, Throw the stick! Yeah, DO IT!";
        } else if (breed.equalsIgnoreCase("Shark")) {
            return "Lets go chase us some sheep!";
        }
        return playing;
    }


}
