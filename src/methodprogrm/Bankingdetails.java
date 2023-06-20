package methodprogrm;

import java.util.Scanner;

interface bank
{
public void showdetails();

public void deposit();
public void withdraw();
public void balance();
}
class SBI implements bank
{
	static String bankname="SBI";
	String accountnumber;
	String name="HEMANDH";
	int balance=10000;
	Scanner sc=new Scanner(System.in);
	
	
	@Override
	public void showdetails() {
		// TODO Auto-generated method stub
		
		System.out.println("ENTER THE ACCOUNT NUMBER");
		int ac=sc.nextInt();
		System.out.println(name);
		System.out.println(bankname);
		System.out.println("ACCOUNT NUMBER IS "+ac);
	}

	

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE DEPOSIT AMOUNT");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("THE BALANCE AMOUNT IS "+balance);
		
				
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE WITHDRAWAL AMOUNT");
		int withdraw=sc.nextInt();
		balance=balance-withdraw;
		
	}
	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("THE BALANCE AMOUNT IS "+balance);
		
	}
}

public class Bankingdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		s.showdetails();
		s.deposit();
		s.withdraw();
		s.balance();
		

	}


}
