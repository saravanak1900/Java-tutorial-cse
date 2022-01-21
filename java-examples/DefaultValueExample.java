class DefValues{
	
	int i;
	float f;
	char c;
	long l;
	short s;
	boolean b;
	byte bt;
	String ss;
	String st="";
	
	void disply_defaultvalues() {
		System.out.println("Default value of int i = " +i);
		System.out.println("Default value of Float f = " +f);
		System.out.println("Default value of long l = " +l);
		System.out.println("Default value of short s = " +s);
		System.out.println("Default value of boolean b = " +b);
		System.out.println("Default value of byte bt = " +bt);
		System.out.println("Default value of String s = " +ss);
		System.out.println("Default value of String st initialized as \"\" = " +st);
	}
	
}

public class DefaultValueExample {
    static String ab;
	public static void main(String[] args) {
     DefValues df = new DefValues();
     df.disply_defaultvalues();
	}

}
