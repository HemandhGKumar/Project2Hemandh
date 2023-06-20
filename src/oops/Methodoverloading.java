package oops;


public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m=new Methodoverloading();
		m.add();
		m.add(10, 20);
		m.add(10, 10.5);
		
		

	}
public void add()
{
int a=12;int b=12;
int s=a+b;
System.out.println(s);
}
public void add(int a,int b)
{
	int s=a+b;
	System.out.println("SUM IS "+s);
}
public void add(int a,double b)
{
double s=a+b;
System.out.println(s);
}

}
	

