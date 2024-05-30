import java.util.*;
public class nondec {

    public static void main(String[] args) {

        ArrayList <Integer> aList1 = new ArrayList<Integer>();
        aList1.add(0, 4);
        aList1.add(1, 2);
        aList1.add(2, 3);

        ArrayList <Integer> aList2 = new ArrayList<Integer>();
        aList2.add(0, 1);
        aList2.add(1, 2);
        aList2.add(2, 2);
        aList2.add(3, 4);

        System.out.println(nonDecreasing(aList1));
        System.out.println(nonDecreasing(aList2));
        
    }
    static boolean nonDecreasing(ArrayList<Integer> a){
        //complete
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i - 1) > a.get(i)) {
                return false;
            }
        }
        return true;
    }
    //returns true if list is non decreasing, and false otherwise
}
