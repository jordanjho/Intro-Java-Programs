import java.util.*;

public class swap_forward {

    public static void main(String[] args) {

        //There is an index out of bounds error
        //Please fix error, see algorithm above 

        ArrayList<Integer> numbers = new ArrayList<Integer>(); //add values to scores
        numbers.add(0, 1);
        numbers.add(1, 3);
        numbers.add(2, 0);
        numbers.add(3, 4);
        numbers.add(4, 2);

        ArrayList<Integer> temp = new ArrayList<Integer>(); //add values to scores (edge case; only applies to end)
        temp.add(numbers.get(numbers.size() - 1)); //Loop, but stop at the last element (edge case) 
        for(int i = 0; i < numbers.size() - 1; i++) {
            temp.add(i + 1, numbers.get(i)); 
        } 
        numbers = temp; //Copy over to original ArrayList  
        System.out.println(numbers);  
    }
    /*
    An ArrayList is filled with int elements.
    Each element is moved up one index.
    There's an edge case for the last one since it goes out of bounds rather than back to index 0.
    */
}