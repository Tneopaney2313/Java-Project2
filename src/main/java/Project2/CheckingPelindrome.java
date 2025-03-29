package Project2;

public class CheckingPelindrome {
    public static void main(String[] args) {
        String input="madam";
        String reversed=new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)){
            System.out.println(input + " is a Palindrome.");
        }else {
            System.out.println(input + "is not a Palindrome");
        }
    }
}
