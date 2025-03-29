package Project2;

public class CountVowels {
    public static void main(String[] args) {
        String input = "documentation";
        int count=0;

        for (int i=0; i<input.length(); i++){
            char ch=input.charAt(i);

            if ("aeiou".indexOf(ch)!=-1){
                count++;

            }
        }
        System.out.println("Vowels count: " + count);

    }
}
