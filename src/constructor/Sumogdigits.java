package constructor;

import java.util.Scanner;

public class Sumogdigits {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE NUMBER");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Sumogdigits s=new Sumogdigits();
		System.out.println("THE SUM OF DIGITS IS "+s.sumogdigits(a));
		
		
	}
		public int sumogdigits(int a)
		{
			int remainder=0,r=0;
		while(a>0)
		{
		
			remainder=a%10;
			r=r+remainder;
			a=a/10;
			
		}
		return r;
		

	}}


