class argu
{
	public static void main(String args[])
	{
		int a,b,c;
			try
			{
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.in.println("result is :"+c);
			}
			catch(ArithmeticException e)
			{
				System.in.println("can divide a no. by zero");
			}
		
		
		System.out.println("programme continuous");
	}
}