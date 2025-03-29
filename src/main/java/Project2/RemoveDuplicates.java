package Project2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> SmartList= new ArrayList<>();
        SmartList.add("Shraddha");
        SmartList.add("Chikhi");
        SmartList.add("Brandon");
        SmartList.add("Chikhi");
        SmartList.add("Shraddha");
        SmartList.add("Sherri");

        HashSet<String> set =new HashSet<>(SmartList);
        SmartList.clear();
        SmartList.addAll(set);

        System.out.println(SmartList);



    }
}
