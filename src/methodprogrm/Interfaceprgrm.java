package methodprogrm;
interface basicanimal
{
public void eat();
public void sleep();
}
class monkey
{
	
public void jump()
{
System.out.println("JUMPING MONKEY");	
}
public void bite()
{
System.out.println("BITING MONKEY");	
}}

class human extends monkey implements basicanimal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("EATING");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep");
		
	}
	
}





public class Interfaceprgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human hu=new human();
		hu.eat();
		hu.sleep();
		hu.jump();
		hu.bite();
		

	}

}
