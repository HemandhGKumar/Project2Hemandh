package array;

import java.util.Scanner;

public class Singledimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a=new int[3];
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER THE NUMBERS");
         for(int i=0;i<3;i++)
         {
        	 a[i]=sc.nextInt();
        	 
         }
         System.out.println("THE ENTERED NUMBERS ARE ");
         for(int i=0;i<3;i++)
         {
        System.out.println(a[i]);
         }
	}

}
