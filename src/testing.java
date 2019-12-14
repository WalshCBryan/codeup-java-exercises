import java.util.Arrays;
import java.util.List;

public class testing {

    public static void main(String[] args) {

        String[] groceries = new String[4];
        groceries[0] = "grocery 1";
        groceries[1] = "grocery 2";
        groceries[2] = "grocery 3";
        groceries[3] = "grocery 4";


        List<String> groceryList = Arrays.asList(groceries);

        System.out.println(groceryList);

        //OR

        List<String> groceryList2 = Arrays.asList("coffee", "milk", "sugar");

        System.out.println(groceryList2);

    }
}