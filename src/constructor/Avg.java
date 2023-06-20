package constructor;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE NUMBERs");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		Avg ob=new Avg();
		ob.average(a, b, c);
		

	}
	public void average(int a,int b,int c)
	{
		int sum=a+b+c;
		int avg=sum/3;
		System.out.println("THE AVERAGE IS "+avg);
	}

}
