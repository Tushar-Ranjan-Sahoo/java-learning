import java.util.*;

public class Collection_framework {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("Shoes");
        items.add("toys");

        Collections.addAll(items,"fruites","bats","balls");

        for (String item : items) {
            System.out.println(item);
        }
    }
}
