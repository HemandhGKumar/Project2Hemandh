package iterativestatements;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE WORD");
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		String r="";
		
		
			for(int i=s.length()-1;i>=0;i--)
			{
				r=r+s.charAt(i);
			}
					System.out.println("reverse ="+r);
					
			if(s.equals(r))
			{
				System.out.println("WORD IS PALINDROME");
			}
			else
			{
				System.out.println("THE WORD IS NOT PALINDROME");
			}
		}

	}


