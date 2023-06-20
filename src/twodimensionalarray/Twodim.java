package twodimensionalarray;

import java.util.Scanner;

public class Twodim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE NUMBERS");
		Scanner sc=new Scanner(System.in);
		int ar[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("THE ENTERED NUMBERS ARE ");
		for(int s[]:ar)
		{
			for(int s1:s)
			{
				System.out.println(s1);
			}
		}
		
		
			
			System.out.println();
			}
		
		
	}


