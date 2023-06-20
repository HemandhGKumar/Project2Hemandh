package methodprogrm;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s=new Shapes();
		s.triangle();
		System.out.println("AREA OF RECTANGLE IS "+s.rectangle());
		System.out.println("AREA OF CIRCLE IS "+s.circle(5));
		System.out.println("AREA OF SQUARE IS "+s.square(10));
		

	}
	public void triangle()
	{
		int a=10,b=5;
		double AreaT=0.5*a*b;
		System.out.println("AREA OF TRIANGLE IS "+AreaT);
		}
	public int rectangle()
	{
		int a=6,b=8;
		int AreaR=a*b;
		return AreaR;
	}
	public double circle(double a)
	{
		double Area=3.14*a*a;
		return Area;
	}
	public int square(int a)
	{
		int AreaSq=a*a;
		return AreaSq;
	}
	
}
