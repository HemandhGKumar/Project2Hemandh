package oops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n1=0;
  int n2=1;
  int n3;
  int count=12;
  
  for(int i=2;i<count;i++)
  {
	 n3=n1+n2;
	 n1=n2;
	 n2=n3;
	 System.out.print(n3);
  }
	}

}
