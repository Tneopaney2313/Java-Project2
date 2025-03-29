package Project2;

import java.util.Arrays;

public class CheckingAnagrams {
    public static void main(String[] args) {

        String input1="listen";
        String input2="silent";

        char[] arr1=input1.toCharArray();
        char[] arr2=input2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println(input1 + " and " + input2 + " are Anagrams");

        }else {
            System.out.println(input1 + " and " + input2 + " are not Anagrams");
        }

    }
}
