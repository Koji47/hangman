package Game;

import java.util.ArrayList;
import java.util.Random;

public class HandleWords {
    public static ArrayList<String> words = new ArrayList<>();

    private static final Random rand = new Random();

    static {
        words.add("Boxing");
        words.add("Fencing");
        words.add("Surfing");
        words.add("Snowboarding");
        words.add("Skiing");
        words.add("Parkour");
        words.add("Football");
        words.add("Basketball");
        words.add("Rugby");
        words.add("Badminton");
        words.add("Tennis");
        words.add("Cricket");
        words.add("Handball");
        words.add("Rowing");
        words.add("Gymnastics");
        words.add("Archery");
        words.add("Athletics");
        words.add("Lacrosse");
        words.add("Golf");
        words.add("Baseball");
        words.add("Wrestling");
        words.add("Judo");
        words.add("Taekwondo");
    }

    public static String getRandomSport() {
        return words.get(rand.nextInt(words.size()));
    }

}
