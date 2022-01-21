import java.util.Vector;
public class VectorExample {
	//  Vector implements List interfaces
	// Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index.
	// Mainly Vector is used in Threaded environment.
	//  it gives a poor performance in adding, searching, deleting, and updating its elements.
	// They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.

	public static void main(String[] args) {
        Vector<String> vs = new Vector<String>();
        Vector<Integer> vi = new Vector<Integer>();
        // Add String Values to Vector <String> "vs" as follows
        vs.add("India");
        vs.add("Australia");
        vs.add("Japan");
        vs.add("Cvina");
        vs.add("Zimbawe");
        vs.add("Cvile");
        vs.add("Malasia");
        vs.add("Singapore");
        vs.add("South Africa");
        vs.add("India");
        vs.add("Japan");
        vs.add(null); // null is  ALLOWED in Vector
        vs.add("Indonesia");
        
        System.out.println("Values of Vector <String> type as follows"); 
        
        System.out.println(vs);
        
        // Add String Values to Vector <String> "vs" as follows
        vi.add(107);
        vi.add(77);
        vi.add(0);
        vi.add(-177);
        vi.add(-9);
        vi.add(8);
        vi.add(57);
        vi.add(27);
        vi.add(37);
        vi.add(77);

        
        System.out.println("Values of Vector <Integer> type as follows"); 
        
        System.out.println(vi);
     
        


	}

	

}
