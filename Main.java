package pik7;

public class Main {
    public static void main(String[] args) {
        final String sentence = "куче бяга";

        Dictionary dictionary = new Dictionary();
        dictionary.add("куче", "dog");
        dictionary.add("куче", "doggie");

        dictionary.add("бяга", "bqga");
        dictionary.add("бяга", "runs");

        System.out.println(dictionary.bestTranslation(sentence));

        dictionary.swapTranslationPriority("куче", "dog", "doggie");
        System.out.println(dictionary.bestTranslation(sentence));

        dictionary.remove("куче", "doggie");
        System.out.println(dictionary.bestTranslation("куче бяга"));

        dictionary.remove("куче", "dog");
        System.out.println(dictionary.bestTranslation(sentence));

        dictionary.add("куче", "dog");
        dictionary.add("бяга", "run");
        System.out.println(dictionary.bestTranslation(sentence));
    }
}
