package array;

import java.util.Scanner;

public class Stringname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] s=new String[5];
 Scanner sc=new Scanner(System.in);
 System.out.println("ENTER THE NAMES");
 for(int i=0;i<5;i++)
 {
	 s[i]=sc.next();
 }
 System.out.println("ENTERED NAMES ARE");
 for(int i=0;i<5;i++)
 {
	System.out.println(s[i]); 
 }
	}

}
