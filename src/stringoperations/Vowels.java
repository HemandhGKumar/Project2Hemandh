package stringoperations;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE SENTENCE");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u')
					{
				count++;
					}
		}
		
		System.out.println("VOWEL COUNT= "+count);
		
	}
	
}
