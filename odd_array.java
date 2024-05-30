import java.util.*;

public class odd_array {
 public static void main(String[] args) {
   ArrayList<Integer> arr = new ArrayList<Integer>();
   
   for(int i=0; i < 5; i++) {
      arr.add(i);

   }
   System.out.println(arr);
   
   for(int i=0; i < arr.size(); i++) {
      if (arr.get(i) % 2 == 0)
      {
         System.out.println("Removing element " + i + " : " + arr.get(i));
         arr.remove(i);
      }
   }
   System.out.println(arr);
   }
   // For loop is used to remove array elements that contain even numbers
}
