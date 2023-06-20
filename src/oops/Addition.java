package oops;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENTER THE FIRST NUMBER TO BE ADDED");
Scanner sca=new Scanner(System.in);
int a=sca.nextInt();
System.out.println("ENTER THE SECON NUMBER TO BE ADDED");
int b=sca.nextInt();
int c=a+b;
   
   System.out.println("THE ADDED RESULT OF THE TWO NUMBERS IS "+c);
	}

}
