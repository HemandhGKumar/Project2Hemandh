package constructor;

public class Sample {
	
	int playerid;
	String playername;
	String sports;
	
	public Sample(int playerid,String playername,String sports)
	{
	this.playerid=playerid;
	this.playername=playername;
	this.sports=sports;
	}
	public void display()
	{
		System.out.println("PLAYERID IS "+playerid);
		System.out.println("PLAYERNAME IS "+playername);
		System.out.println("SPORTS IS "+sports);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample(101,"VIRAT","CRICKET");
		s.display();
		

	}

}
