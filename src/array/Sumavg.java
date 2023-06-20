package array;

import java.util.Scanner;

public class Sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a=new int[4];
    Scanner sc=new Scanner(System.in);
    int sum=0;
    double avg=0;
    System.out.println("ENTER THE NUMBERS");
    for(int i=0;i<4;i++)
    {
    	a[i]=sc.nextInt();
    }
    for(int i=0;i<4;i++)
    {
    
    	sum=sum+a[i];
    	
    }
    System.out.println(sum);
    {
    avg=sum/5;
    }
    System.out.println(avg);
	}

}
