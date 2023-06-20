package stringoperations;

import java.util.Scanner;

public class Languagecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE SENTENCE");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.contains("LANGUAGE"))
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("FAIL");
		}

	}

}
