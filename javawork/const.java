class alpha
{
	int i,j;
	alpha(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.println("i & j of super class" + i+" "+j);
	}
}

class beta extends alpha
{
	int i,j;
	beta(int i,int j)
	{	super(i+10,j+5);
		this.i=i;
		this.j=j;
	}
	void display()
	{
		super.diaplay();
		System.out.println("i & j of super class" + i+" "+j);
	}
	void sum()
	{
		int s=i+j+super.i+super.j;
		
		System.out.println("sum is " + s);
	}
}
class const
{
	public static void main(String args[])
	{
	beta bb=new beta(5,10);
	bb.display();
	bb.sum();
	}
}	