package sample;

interface Tvremote
{
public void brandname();
public void year();
}
interface smarttvremote
{
public void feature();
public void warranty();
}
class TV implements Tvremote,smarttvremote
{
	@Override
	public void feature() {
		// TODO Auto-generated method stub
		System.out.println("SMART");
	}

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		System.out.println("4 years");
	}

	@Override
	public void brandname() {
		// TODO Auto-generated method stub
		System.out.println("SONY");
	}

	@Override
	public void year() {
		// TODO Auto-generated method stub
		System.out.println("2021");
	}
}

public class ProgrameTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t=new TV();
		t.brandname();
		t.warranty();
		t.year();
		t.feature();
		

	}

}
