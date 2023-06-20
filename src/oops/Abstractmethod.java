package oops;
abstract class car1
{
abstract public void speedlimit();
public void engine()
{
	System.out.println("SPEED");
}
}
class lambhorghini extends car1
{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("LAMBHO SPEEDLIMIT");
	}
	
}
class bmw extends car1
{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("bmwSpeedlimit");
	}
	
}


public class Abstractmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  lambhorghini lambho=new lambhorghini();
  lambho.engine();
  lambho.speedlimit();
  bmw bm=new bmw();
  bm.engine();
  bm.speedlimit();
	}

}


