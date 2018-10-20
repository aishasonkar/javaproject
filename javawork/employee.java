class argemployee
{
	static double inc=0.04; 
	int code,salary;
	String name;
	void getdata(String p,int q,int r)
	{
		name=p;
		code=q;
		salary=r;
	}
	void display()
	{
		
	}
	static void increment(double np)
	{
		inc=np;
	}
}

class employee
{
	public static void main(String args[])
	{
		argemployee e1=new argemployee();
		e1.getdata("ram",101,23000);
		e2.getdata("gia",102,21000);
		argemployee.increment(0.05);
		e1.display();
		e2.display();
	}
}
	
