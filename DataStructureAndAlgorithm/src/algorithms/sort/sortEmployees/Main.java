package algorithms.sort.sortEmployees;

import java.util.ArrayList;
import java.util.Collections;

//Driver class
public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> ar = new ArrayList<Employee>(); 
        ar.add(new Employee("Mr.", "bbbb", "london")); 
        ar.add(new Employee("Mrs.", "aaaa", "nyc")); 
        ar.add(new Employee("Miss", "cccc", "jaipur")); 
        ar.add(new Employee("Miss", "cccc", "aipur"));
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
//        Collections.sort(ar, new Sortbyname()); 
//  
//        System.out.println("\nSorted by rollno"); 
//        for (int i=0; i<ar.size(); i++) 
//            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new Sortbyname()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
    } 

}
