package oops;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int number=370,n=number,temp,total=0;
  
  while(n!=0)
  {
	  temp=n%10;
	  total=total+temp*temp*temp;
	  n=n/10;
  }
  if(total==number)
  {
	  System.out.println(number+" IS AMSTRONG NUMBER");
	  
  }
  else 
  {
	  System.out.println(number+" IS NOT AMSTRONG");
  }
	}

}
