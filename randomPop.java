import java.util.ArrayList;
public class randomPop {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            arr1.add(i, (int)((Math.random() * 1000) + 1));
        }
        System.out.println(arr1);
    }
    //A for loop is used to fill up the entire ArrayList with random #'s from 1 to 1000
}
