import java.io.*;  
class Customer{
String name;
Long mobile;
String email;
    
	void get_data() throws Exception{
		
        InputStreamReader r = new InputStreamReader(System.in);    
		BufferedReader br = new BufferedReader(r); 
		       
		System.out.println("Enter Customer name : ");    
		name=br.readLine();    
		
		System.out.println("Enter Customer mobile number : ");    
		mobile=Long.parseLong(br.readLine()); 
		
		System.out.println("Enter Customer email : ");    
		email=br.readLine(); 
    }

	void display_data() throws Exception{
	    		
	    System.out.println("Customer name   : "+name);    
        System.out.println("Customer mobile : "+mobile);
		System.out.println("Customer email  : "+email);


	}
}
public class Cse{    

	public static void main(String args[]) throws Exception{             
   
		Customer c = new Customer();
		c.get_data();
		System.out.println("Customer Enquiry Details ");  
        System.out.println("*************************");
		c.display_data();
	
	}    
}  