package Array;

public class ExceptionHandling {
public static void main(String[] args) {
	int a = 25;
	String s1=null;
	//System.out.println(a/0);
	try {
		System.out.println("1");
		System.out.println(s1.length());
		System.out.println(a/0);
		System.out.println("2");
	}
	catch (NullPointerException npe) {
		System.out.println("catch1");}
	catch (ArithmeticException ame) {
		System.out.println("catch2");
	}
	catch (Exception ec) {
		System.out.println("catch2");
	}
	finally {
		System.out.println("Finally");
	}
	
	
	
	
}
	
	
}
