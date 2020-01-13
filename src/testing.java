import javax.swing.*;
import java.util.*;

public class testing {

//    public ArrayList<Integer> MergeLists (ArrayList<Integer> AL1, ArrayList<Integer> AL2) {
//        ArrayList<Integer> ComboList = new ArrayList<>();
//        for (int i = 0; i < AL1.size(); i++) {
//            ComboList.add(AL1.get(i));
//        }
//        for (int i = 0; i < AL2.size(); i++) {
//            ComboList.add(AL2.get(i));
//        }
//        Collections.sort(ComboList);
//        return ComboList;
//    }

    public ArrayList<Integer> MergeLists(ArrayList<Integer> AL1, ArrayList<Integer> AL2) {
        ArrayList<Integer> ComboList = new ArrayList<>();
        ComboList.addAll(AL1);
        ComboList.addAll(AL2);
        Collections.sort(ComboList);
        return ComboList;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        System.out.println(s);
        System.out.println(d);
        System.out.println(i);

//
//        String[] groceries = new String[4];
//        groceries[0] = "grocery 1";
//        groceries[1] = "grocery 2";
//        groceries[2] = "grocery 3";
//        groceries[3] = "grocery 4";
//
//
//        List<String> groceryList = Arrays.asList(groceries);
//
//        System.out.println(groceryList);
//
//        //OR
//
//        List<String> groceryList2 = Arrays.asList("coffee", "milk", "sugar");
//
//        System.out.println(groceryList2);

    }
}