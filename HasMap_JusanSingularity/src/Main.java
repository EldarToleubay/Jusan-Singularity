import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        HashMap<String, String> countries = new HashMap<>();
        System.out.println("--------------------------- 1 TASK------------------------------------");
        countries.put("Sweden", "Stockholm");
        countries.put("USA", "Washington");
        countries.put("England", "London");
        countries.put("Netherlands", "Amsterdam");
        System.out.println(countries);
        System.out.println("--------------------------- 2 TASK------------------------------------");
        System.out.println(countries.size());
        System.out.println("--------------------------- 3 TASK------------------------------------");
        HashMap<String, String> countries2 = new HashMap<>();
        countries2.put("Brazil","Brazilian");
        System.out.println(countries2);
        countries2.putAll(countries);
        System.out.println(countries2);
        System.out.println("--------------------------- 4 TASK------------------------------------");
        System.out.println(countries2);
        countries2.clear();
        System.out.println(countries2);
        System.out.println("--------------------------- 5 TASK------------------------------------");
        Boolean keyContains = countries.containsKey("USA");
        System.out.println(keyContains);

        System.out.println("--------------------------- 6 TASK------------------------------------");
        HashMap<String, String> newHashMap = new HashMap<String,String>();
        System.out.println(newHashMap);
        newHashMap = (HashMap)countries.clone();
        System.out.println(newHashMap);
        System.out.println("--------------------------- 9 TASK------------------------------------");
        Set set = countries.entrySet();
        System.out.print("Original HashMap: ");
        System.out.println(countries);
        System.out.print("Set View of HashMap: ");
        System.out.println(set);

        System.out.println("--------------------------- 9 TASK------------------------------------");

    }
}
