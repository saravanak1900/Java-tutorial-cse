package cse.saravana;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		// The HashSet class implements the Set interface
		// The underlying data structure for HashSet is Hashtable.
		// As it implements the Set Interface, duplicate values are not allowed.
		// Objects that you insert in HashSet are not guaranteed to be inserted in the same order. 
		// Objects are inserted based on their hash code.
		// NULL elements are allowed in HashSet.
		// HashSet also implements Serializable and Cloneable interfaces.
		
        HashSet<String> hs = new HashSet<String>();
        HashSet<Integer> hi = new HashSet<Integer>();
        // Add String Values to HashSet <String> "hs" as follows
        hs.add("India");
        hs.add("Australia");
        hs.add("Japan");
        hs.add("China");
        hs.add("Zimbawe");
        hs.add("Chile");
        hs.add("Malasia");
        hs.add("Singapore");
        hs.add("South Africa");
        hs.add("India");
        hs.add("Japan");
        hs.add(null); // null is allowed in HashSet
        hs.add("Indonesia");
        
        System.out.println("Values of HashSet <String> type as follows"); 
        
        System.out.println(hs);
        
        // Add String Values to HashSet <String> "hs" as follows
        hi.add(107);
        hi.add(77);
        hi.add(0);
        hi.add(-177);
        hi.add(-9);
        hi.add(8);
        hi.add(57);
        hi.add(27);
        hi.add(37);
        hi.add(77);

        
        System.out.println("Values of HashSet <Integer> type as follows"); 
        
        System.out.println(hi);
     
        


	}

}
