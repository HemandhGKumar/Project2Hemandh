package methodprogrm;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m=new Method();
		m.add();
		System.out.println("subtraction result is "+m.subtraction());
		System.out.println("multiplication result "+m.multiplication(45,50));
		m.division(80,4);

	}
	public void add()
	{
		int a=20,b=30;
		int sum=a+b;
		System.out.println("SUM IS "+sum);
			
	}
	public int subtraction()
	{
		int a=25,b=45;
		int sub=a-b;
		return sub;
	}
	public int multiplication(int a,int b)
	{
		int mul=a*b;
		return mul;
		
	}
	public void division(int a,int b)
	{
		int div=a/b;
		System.out.println("DIVISION RESULT IS "+div);
		
	}

}
