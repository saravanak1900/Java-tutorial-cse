import java.util.ArrayList;
import java.io.*;
public class ArrayListExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name="";
		ArrayList<String> l = new ArrayList<String>();
		l.add("Saravana");
		l.add("Faishal");
		l.add("Anas");
		l.add("Sheick");
		System.out.println(l);
		InputStreamReader r = new InputStreamReader(System.in);    
		BufferedReader br = new BufferedReader(r); 
	    System.out.println("Type END and Press Enter to stop the program");

		while(!name.equalsIgnoreCase("END")) {
			
			System.out.println("Enter Customer name : ");    
			name=br.readLine(); 
			
			l.add(name);
				
		}
		System.out.println("Array List after adding data Dynamically");
		System.out.println(l);

	}

}