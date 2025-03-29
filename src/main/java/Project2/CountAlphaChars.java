package Project2;

public class CountAlphaChars {
    public static void main(String[] args) {

        String input= "Hello Syntax 123!";
        int count=0;

        for (int i=0; i<input.length(); i++){
            if (Character.isLetter(input.charAt(i))){
                count++;
            }
        }
        System.out.println("Alpha characters: " + count);
    }
}
