import java.util.Scanner;
class bank1
{
	int amount;
	double balance;
	String name;

	void getdata()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the value of amount");
		amount=kb.nextInt();
		System.out.println("enter the value of balance");
		balance=kb.nextDouble();
		System.out.println("enter the value of name");
		name=kb.next();
	}
	void deposite()
	{
		balance=balance+amount;
		
	}
	void withdraw()
	{
		balance=balance-amount;
		System.out.println("the value of balance" +balance);
	}
	void display()
	{
		System.out.println("the value of balance" +balance);
	}
}


class bank
{
	public static void main(String args[])
	{
		bank1 b=new bank1();
		b.getdata();
		b.deposite();
		b.withdraw();
		b.display();
	}
}
