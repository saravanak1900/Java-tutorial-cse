package cse.saravana;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		// The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided
		// TreeSet is one of the most important implementations of the SortedSet interface 
		// As it implements the Set Interface, duplicate values are not allowed.
		// Objects that you insert in TreeSet are not guaranteed to be inserted in the same order. 
		// Objects are inserted based on their hash code.
		// NULL elements are NOT ALLOWED in TreeSet.
		// TreeSet also implements Serializable and Cloneable interfaces.
		
        TreeSet<String> ts = new TreeSet<String>();
        TreeSet<Integer> ti = new TreeSet<Integer>();
        // Add String Values to TreeSet <String> "ts" as follows
        ts.add("India");
        ts.add("Australia");
        ts.add("Japan");
        ts.add("Ctina");
        ts.add("Zimbawe");
        ts.add("Ctile");
        ts.add("Malasia");
        ts.add("Singapore");
        ts.add("South Africa");
        ts.add("India");
        ts.add("Japan");
        // ts.add(null); // null is NOT ALLOWED in TreeSet
        ts.add("Indonesia");
        
        System.out.println("Values of TreeSet <String> type as follows"); 
        
        System.out.println(ts);
        
        // Add String Values to TreeSet <String> "ts" as follows
        ti.add(107);
        ti.add(77);
        ti.add(0);
        ti.add(-177);
        ti.add(-9);
        ti.add(8);
        ti.add(57);
        ti.add(27);
        ti.add(37);
        ti.add(77);

        
        System.out.println("Values of TreeSet <Integer> type as follows"); 
        
        System.out.println(ti);
     
        


	}

}
