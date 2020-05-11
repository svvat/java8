import java.util.ArrayList; 

public class lambda01 {
    public static void main(String[]args) {
        // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        ArrayList<Integer> intList = new ArrayList<Integer>(); 
        intList.add(1); 
        intList.add(2); 
        intList.add(3); 
        intList.add(4); 

        System.out.println("Print using Java7 for loop:");
        // Java7 for loop 
        for (Integer item : intList) {
            System.out.format("Value = %d\n", item);
        }

        System.out.println("Print using Java8 lambda:");
        // Java 8 lambda
        intList.forEach(i -> System.out.format("Value = %d\n", i));
    }
}
