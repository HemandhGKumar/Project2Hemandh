package stringoperations;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="selenium webdriver is used for web pplication";
		String v[]=s.split(" ");
		for(String s1:v)
		{
			
			System.out.println(s1);
			if(s1.contains("used"))
			{
			break;
			}
		}
		
			
		
		}
		}

	


