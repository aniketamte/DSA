import java.util.*;

public class iteration {
      public static void main(String[] args) {
            HashMap<String, Integer> hm = new HashMap<>();

            hm.put("India", 500);
            hm.put("China", 400);
            hm.put("USA", 300);
            hm.put("Indonesia", 200);
            hm.put("Nepal", 100);

            //Iterate

            Set<String> keys = hm.keySet();
            System.out.println(keys);

            for (String k : keys) {
                  System.out.println("Keys = " + k + ", Value = " + hm.get(k));
            }
      }
}
