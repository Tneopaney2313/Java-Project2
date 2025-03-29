package Project2;

public class WordsCount {
    public static void main(String[] args) {
        String input="Hello, world!";

        String[] words=input.split("[,\\s!]+");
            System.out.println("Number of words: " + words.length);
        }
    }

