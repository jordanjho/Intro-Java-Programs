import java.util.*;

//Finds the smallest element in an ArrayList and returns it.
public class smallest_element
{
    public static void main(String [] args) {
        ArrayList<Integer> aList = new ArrayList <Integer>();
        aList.add(4);
        aList.add(60);
        aList.add(11);
        aList.add(-10);

        System.out.println(findSmallest(aList));
    }

    //receives an arraylist and returns the smallest value,
    public static int findSmallest(ArrayList<Integer>aList){
        int min = aList.get(0);
        for (int i = 1; i < aList.size(); i++) {
            if (min > aList.get(i)) {
                min = aList.get(i);
            }
        }
        return min;
    }
    /*
    Elements are added to an ArrayList.
    The elements are then compared to each other in an ArrayList.
    If the subsequent element is smaller, it becomes the new smallest #.
    */
}

