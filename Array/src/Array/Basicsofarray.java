package Array;

public class Basicsofarray {
public static void main(String[] args) {
	//Declaration and Initialization
	int a[]= {2,7,8,3};
	int b[]= {1,4,9,10};
	// Declaration
	int c[]=new int [2];
	int []d=new int [1];
	System.out.println(a[3]);
	System.out.println(b[2]);
	//Now initialization  to array c and d
	c[0]=10;
	c[1]=25;
	//c[2]=30; not possible as array c size is 2 only
	System.out.println(c[0]);
	System.out.println(c[1]);
	//c[2]=30;// AIOB error will come because array size is 2 only
	d[0]=250;
	System.out.println(d[0]);
	//d[1]=350;//will give AIOB as array size of d is only one
}
}
