package Project2;

import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {
        String input="Hello";
        String reversed=new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }
}
