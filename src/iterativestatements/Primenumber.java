package iterativestatements;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int count=0;
          
          System.out.println("ENTER THE NUMBER");
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          if(n<0)
          {
        	  System.out.println("CANNOT INPUT NEGATIVE NUMBERS");
          }
          else
          {
          for(int i=1;i<=n;i++)
          {
        	  if(n%i==0)
        	  {
        		 count++; 
        		 
        	  }
        	  }
        	  if(count==2)
        	  {
        		  System.out.println("THE NUMBER IS PRIME");
        	  }
        	  else
        	  {
        		  System.out.println("THE NUMBER IS NOT PRIME");
        	  }
        
          }
          }
          
	}


