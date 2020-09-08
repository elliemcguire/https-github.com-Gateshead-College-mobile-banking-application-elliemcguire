package animals;

public class Cat {
    private String name;
    private String size;
    private String breed;
    private byte age;

    public Cat(String name, String size, String breed, byte age) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.age = age;
    }

    public String meow(String size) {
        String bark = "";

        switch (size.toLowerCase()) {

            case "small":
                return "Prrr";

            case "medium":
                return "Meow, Meow";

            case "large":
                return "Meow Meow!";

            default:
                return "error, please tell me how big your cat is";

        }

    }

//        if (size.equalsIgnoreCase("small")) {
//            return "Prrr";
//        } else if (size.equalsIgnoreCase("medium")) {
//            return "Meow";
//        } else if (size.equalsIgnoreCase("large")) {
//            return "Meow, meow!";
//        } else {
//            return "Sorry, I seem to have lost my voice!";
//        }


    public String beHuman(String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old "
                + breed + ", What breed are you?";
    }

    public String play(String breed) {
        String playing = "";

        switch (breed.toLowerCase()) {

            case "Tabby":
                return "Let me chase that pigeon!";

            case "Siamese":
                return "Yeah, Yeah, Let me chase that mouse!";

            case "Siberian":
                return "Lets play with that ball!";
        }
        return breed;
    }

//        if (breed.equalsIgnoreCase("Tabby")) {
//            return "Oh dear, I don't think so, one could not possible engage in such activities";
//        } else if (breed.equalsIgnoreCase("Siamese")) {
//            return "Yeah, Yeah, Let me chase that mouse!";
//        } else if (breed.equalsIgnoreCase("Siberian")) {
//            return "Lets play with that ball!";
//        }
//        return playing;


}




