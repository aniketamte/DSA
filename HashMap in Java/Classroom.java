
import java.util.HashMap;

public class Classroom {
    public static void main(String[] args) {
      HashMap<String, Integer> HM = new HashMap<>();

      //Insert- O(1)
      HM.put("Tea", 100);
      HM.put("Coffee",150);
      HM.put("Milk", 200);

      System.out.println("Insert Function : " + HM);

      int price = HM.get("Coffee");
      System.out.println("Price of Coffee : " + price);

      //containsKey - O(1) 
      System.out.println(HM.containsKey("Tea"));   //True  -> Exist key
      System.out.println(HM.containsKey("India"));  //False-> Does not exzist

      //remove -> O(1)
      System.out.println(HM.remove("Milk"));
      System.out.println("Updated List : " + HM);

      //size
      System.out.println(HM.size());

      //isEmpty
      System.out.println(HM.isEmpty());   //False -> List is not emptty
    }  
}
