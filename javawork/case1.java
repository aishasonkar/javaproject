import java.util.Scanner;
class case1
{
	public static void main(String args[])
	{
		Scanner kb= new Scanner(System.in);
		String s,b,d;
		s=kb.next();
		System.out.println("the value of string "+s);
		b=s.toUpperCase();
		System.out.println("the value of string "+b);
		d=s.toLowerCase();
		System.out.println("the value of string "+d);
	}
}