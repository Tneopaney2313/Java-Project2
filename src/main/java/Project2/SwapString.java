package Project2;

public class SwapString {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Syntax";

        System.out.println("Original string: " + str1 + " " + str2);
        str1=str1 + str2;
        str2=str1.substring(0, str1.length() - str2.length());
        str1=str1.substring(str2.length());

        System.out.println("Swapped string: " + str1 + " " + str2);
    }
}
