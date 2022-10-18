package Array;

public class StringProgramMock {
public static void main(String[] args) {
	String s11 ="Goal";
	String s21= "";
	
	for (int i=s11.length()-1;i>=0;i--) {
		s21= s21+s11.charAt(i);
		}
	
	System.out.println(s21);
	
}
}
