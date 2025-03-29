package Project2;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input= "abracadabra";

        for (int i=0; i<input.length(); i++){
            if (input.indexOf(input.charAt(i))== input.lastIndexOf(input.charAt(i))){
                System.out.println("First non-repeating character: " + input.charAt(i));
                break;
            }

        }
    }
}
