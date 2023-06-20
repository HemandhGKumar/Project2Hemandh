package oops;
interface Actor
{
public void Salary();
public void HitStatus();
public void BoxOffice();
}
interface awards
{
public void award();	
}

class Mohanlal implements Actor,awards

{

	@Override
	public void Salary() {
		// TODO Auto-generated method stub
		System.out.println("5 crore");
	}

	@Override
	public void HitStatus() {
		// TODO Auto-generated method stub
		System.out.println("Positive");
	}

	@Override
	public void BoxOffice() {
		// TODO Auto-generated method stub
		System.out.println("BLOCKBUSTER");
	}

	@Override
	public void award() {
		// TODO Auto-generated method stub
		System.out.println("yes");
	}
	}
class Mammootty implements Actor,awards
{

	@Override
	public void Salary() {
		// TODO Auto-generated method stub
		System.out.println("3 crore");
	}

	@Override
	public void HitStatus() {
		// TODO Auto-generated method stub
		System.out.println("medium");
	}

	@Override
	public void BoxOffice() {
		// TODO Auto-generated method stub
		System.out.println("AVERAGE");
	}

	@Override
	public void award() {
		// TODO Auto-generated method stub
		System.out.println("yes");
	}
	}

public class Interfaceprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Mohanlal mo=new Mohanlal();
		  mo.BoxOffice();
		  mo.Salary();
		  mo.HitStatus();
		  mo.award();
		 
		  
		  Mammootty ma=new Mammootty();
		  ma.BoxOffice();
		  ma.Salary();
		  ma.HitStatus();
		  ma.award();
			
	    
 

}}
