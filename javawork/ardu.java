import java.io.*;
class ardu
{
	static char getcar()throws IOexception
	{
		char ch;
		System.out.println("entry any char");
		ch=(char)System.out.read();
		return ch;
	}
	public static void main(String args[])
	{
		char c;
		try
		{
			c=getchar();
			System.out.println("entered chrachter is: "+c);
		}
		catch(IOexception e)
		{
			System.out.println("exception caught :"+ e);
		}
	}
}