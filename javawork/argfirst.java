class first
{
	int a=10;
	void geta()
	{
		
	}
	void puta()
	{	
		System.out.println("the value of a "+a);
	}
}

class square extends first
{	

	int s;
	void sq()
		
	{	
		puta();
		s=a*a;
		System.out.println("the value of a "+s);
	}
}

class cube extends first
{
	int c;
	void cu()

	{	
		
		puta();
		c=a*a*a;
		System.out.println("the value of a "+c);
	}
}

class argfirst
{
	public static void main(String args[])
	{
		cube c1=new cube();
		c1.cu();
		square s1=new square();
		s1.sq();
	}
}
