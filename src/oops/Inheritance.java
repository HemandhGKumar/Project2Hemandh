package oops;

class Animal
{
	public void animalname()
	{
		System.out.println("NAME");
	}
}
class Dog extends Animal
{
public void breed()
{
System.out.println("BREED");

}
}
class Highbreed extends Dog
{
public void size()
{
System.out.println("SIZE");	
}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Highbreed high=new Highbreed();
		high.size();
		high.breed();
		high.animalname();

	}

}
