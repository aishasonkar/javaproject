import java.io.*;
class ardu1
{
	static char getchar()throws IOException
	{
		char ch;
		System.out.println("entry any char");
		ch=(char)System.in.read();
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
		catch(IOException e)
		{
			System.out.println("exception caught :"+ e);
		}
	}
}