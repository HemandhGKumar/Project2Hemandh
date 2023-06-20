package stringoperations;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HELLO";
		String s2="hello";
		String s3="Hello,How are you?";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(1+2+3+s3+4+5);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.contains("Hello"));
		System.out.println(s1.toLowerCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s3.length());
		System.out.println(s1.startsWith("HELLO"));
		System.out.println(s3.endsWith("you?"));
		System.out.println(s3.substring(4,8));
		System.out.println(s1.charAt(3));
		String[] s=s3.split(" ");
		for(String v:s)
		{
			System.out.println(v);
		}

	}

}
