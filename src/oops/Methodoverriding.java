package oops;

class car
{
public void accelarator()
{
System.out.println("ACCELARATOR");	
}}
class BMW extends car
{

	@Override
	public void accelarator() {
		// TODO Auto-generated method stub
		System.out.println("BMW ACCELARATOR");
		super.accelarator();
	}
	
}


public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b=new BMW();
		b.accelarator();
	Accessmodifiers acc=new Accessmodifiers();
	System.out.println(acc.a);

	}

	
}
