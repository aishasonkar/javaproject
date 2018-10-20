import java.util.Scanner;
class capital
{
	public static void main(String args[])
	{
		Scanner kb=new Scanner(System.in);
		String s,t,p;
		s=kb.next();
		System.out.println("the value of string is :"+s);
		if(s.length()>=3)
		{
			if(s.endsWith("ing"))
			{
				t=s+"ly";
				System.out.println("the value after adding ly is" +t);
			}
			else
			{
				p=s+"ing";
				System.out.println("the value after adding ly is "+ p);
			}
		}
	}
}

	
	