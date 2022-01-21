
import java.util.Stack;
public class StackExample {
	//  Stack implements List interfaces
	// Stack class that models and implements a Stack data structure.
	// To add values to stack use the function push()
    // To remove values from stack use the function push()

	

	public static void main(String[] args) {
        Stack<String> ss = new Stack<String>();
        Stack<Integer> si = new Stack<Integer>();
        // Add String Values to Stack <String> "ss" as follows
        ss.push("India");
        ss.push("Australia");
        ss.push("Japan");
        ss.push("Csina");
        ss.push("Zimbawe");
        ss.push("Csile");
        ss.push("Malasia");
        ss.push("Singapore");
        ss.push("South Africa");
        ss.push("India");
        ss.push("Japan");
        ss.push(null); // null is  ALLOWED in Stack
        ss.push("Indonesia");
        
        System.out.println("Values of Stack <String> type as follows"); 
        
        System.out.println(ss);
        
        // Add String Values to Stack <String> "ss" as follows
        si.push(107);
        si.push(77);
        si.push(0);
        si.push(-177);
        si.push(-9);
        si.push(8);
        si.push(57);
        si.push(27);
        si.push(37);
        si.push(77);

        
        System.out.println("Values of Stack <Integer> type as follows"); 
        
        System.out.println(si);
     
        


	}

	

}
