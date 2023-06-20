package iterativestatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;int reverse=0;
		System.out.println("ENTER THE NUMBER");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			reverse=reverse*10+r;
			n=n/10;
			}
		System.out.println(reverse);
		if(reverse==temp)
		{
			System.out.println("THE ENTERED NUMBER IS PALINDROME");
		}
		else
		{
			System.out.println("THE NUMBER IS NOT PALINDROME");
		}
		

	}

}
