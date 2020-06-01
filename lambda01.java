/*
    file: lambda01
    description: print series of numbers using lambda
*/

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class lambda01 {

    private static ArrayList<Integer> getIntList(int n) {
        // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        ArrayList<Integer> intList = new ArrayList<Integer>(); 
        for(int i=0;i<n;i++) {
            intList.add(i+1); 
        }
        return intList; 
    }

    public static void main(String[]args) {
        // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        ArrayList<Integer> intList = getIntList(5);

        System.out.println("Print using Java7 for loop:");
        // Java7 for loop 
        for (Integer item : intList) {
            System.out.format("Value = %d\n", item);
        }

        System.out.println("Print using Java8 lambda:");
        // Java 8 lambda
        intList.forEach(i -> System.out.format("Value = %d\n", i));
    }
    @Test 
    public void testPercent() {
        ArrayList<Integer> intList = getIntList(5);
        assertEquals(5, intList.size());
    }
}

