package Array;

public class Arrayintrever1 {
public static void main(String[] args) {
	int a[]= {34,45,56,67,77,88};
	int c[]=new int[10];
	int m=0;
	for(int i=a.length-1;i>=0;i--) {
		c[m]=a[i];
		m++;
	}
	for(int i =0;i<=a.length-1;i++)
	System.out.println(c[i]);
}
}
