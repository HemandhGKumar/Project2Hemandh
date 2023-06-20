package oops;
class employee1
{
String name;
int age;
String phonenumb;
int salary;
String address;

public void printdetails()
{
	System.out.println("NAME IS "+name);
	System.out.println("AGE IS "+age);
	System.out.println("PHONENUMBER IS "+phonenumb);
	System.out.println("SALARY IS "+salary);
	System.out.println("ADDRESS IS "+address);
	}
}
class employer extends employee1
{
	public void specialisation()
	{
		System.out.println("SPECIALISATION IS SAFETY");
	}
	}
class manager extends employee1
{
public void department()
{
	System.out.println("DEPARTMENT IS HSE");
}
}


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employer emp=new employer();
		manager m=new manager();
		emp.address="erf";
		emp.age=28;
		emp.name="A";
		emp.phonenumb="887451245";
		emp.salary=5400;
		emp.specialisation();
		emp.printdetails();
		m.address="ghj";
		m.age=58;
		m.name="upi";
		m.phonenumb="55578412";
		m.salary=6540;
		m.printdetails();
		m.department();
				
				

	}

}
