/*
    file: lambda02
    description: 
     - get the average of a series of numbers using lambda expressions
     - extend ArrayList<integer> and add average() method

*/


import java.util.ArrayList; 


class mylist extends ArrayList<Integer> {

    private static final long serialVersionUID = 1L;
    
    public double average() {
      return this.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}

public class lambda02 {
    public static void main(String[]args) {
        // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        mylist intList = new mylist(); 
        intList.add(1); 
        intList.add(2); 
        intList.add(3); 
        intList.add(4); 

        System.out.println("Print using Java7 for loop:");
        // Java7 for loop 
        int sum = 0;
        for (Integer item : intList) {
            sum += item;
        }
        double avg = (double)sum / intList.size();

        System.out.format("Java 7 Average = %.2f\n", avg);

        System.out.format("Java8 lambda average = %.2f\n:", intList.average());
    }
}
