package Array;

import java.util.Arrays;

public class Arrayreversing {
public static void main(String[] args) {
	int a[]= {1,3,5,0};
	//System.out.println(a[0]);
	//System.out.println(a[3]);
	int b=a.length;//here b will store length of array i.e.4 a
	Arrays.sort(a);//Ascending order
	//System.out.println(a[0]);
	//System.out.println(a[3]);
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	
}}
		
	
	


