import java.util.ArrayList;
public class evens_to_odds {

    public static void main(String[] args) {
      ArrayList<Integer> arr1 = new ArrayList<Integer>();
      arr1.add(0, 7);
      arr1.add(1, 12);
      arr1.add(2, 3);
      arr1.add(3, 9);
      arr1.add(4, 4);
      arr1.add(5, 888);

      int odd = arr1.get(0);
      for (int i = 0; i < arr1.size(); i++) {
        if (arr1.get(i) % 2 == 0) {
            arr1.set(i, odd);
        }
        else if (arr1.get(i) % 2 != 0) {
            odd = arr1.get(i);
        }
      }
      System.out.println(arr1);
    }
    //If an element in the ArrayList is even, it is replaced with the most recent odd element
}