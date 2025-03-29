package Project2;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static void main(String[] args) {

        List<String> strings=new ArrayList<>();
        strings.add("North America");
        strings.add("Asia");
        strings.add("South America");
        strings.add("Antarctica");
        strings.add("Africa");
        strings.add("Europe");
        strings.add("Australia");

        List<String> result=new ArrayList<>();

        for (String str:strings){
            if (str.toLowerCase().startsWith("a")){
                result.add(str.toLowerCase());

            }
        }
        System.out.println(result);
    }
}
