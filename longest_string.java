import java.util.ArrayList;
public class longest_string {
    public static String findLongest(ArrayList<String> list)
    {
        String longest = "";
        //added for loop code here
        for (int i = 0; i < list.size(); i++) {
            if (longest.length() < list.get(i).length()) {
                longest = list.get(i);
            }
        }
        return longest;
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList (create object) and fill with Integers afterwards
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++)
        {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.print("Your Result:\t\t ");
        System.out.println(findLongest(values));
    }
    /*
    An ArrayList is filled with String type elements.
    Afterwards, a for loop is run to determine which element has the largest # of chars.
    If the subsequent element has a larger # of char's than the current, it becomes the next largest.
    */
}