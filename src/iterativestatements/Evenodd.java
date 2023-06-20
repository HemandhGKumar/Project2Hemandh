package iterativestatements;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("ENTER THE NUMBERS");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int c=0;
  int d=0;
  for(int i=1;i<=n;i++)
  {
	  if(n%2==0)
	  {
		 c=c+n; 
		 System.out.println(c);
	  }
	  else
	  {
		d=d+n; 
		System.out.println(d);
	  }
	  System.out.println("SUM OF EVEN NUMBERS IS "+c);
	  System.out.println("SUM OF ODD NUMBERS IS"+d);
  }
  
	}

}
