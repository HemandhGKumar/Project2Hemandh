package iterativestatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ENTER THE FIRST NUMBER");
		Scanner sc=new Scanner(System.in);
		double m=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		double n=sc.nextInt();
		System.out.println("ENTER YOUR CHOICE 1.ADD 2.SUB 3.MULT 4.DIV");
		int ch=sc.nextInt();
		double result=0;
		switch(ch)
		{
		case 1:result=m+n;
		break;
		case 2:result=m-n;
		break;
		case 3:result=m*n;
		break;
		case 4:if(n==0)
		{
			System.out.println("ERROR");
		}
		else
		{
			
			result=m/n;
		}
		break;
		default:System.out.println("INVALID CHOICE");
		
		}
		System.out.println("THE RESULT IS "+result);
		
			
		
		

	}

}
