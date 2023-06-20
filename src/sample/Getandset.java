package sample;
class Emp
{
private String empname;
private String designation;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

}


public class Getandset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.setEmpname("HEMANDH");
		e.setDesignation("tester");
		System.out.println(e.getEmpname());
		System.out.println(e.getDesignation());
		

	}

}
