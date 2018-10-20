class student
{
	int rollno;
	String name;
	void get(int p,String q)
	{
		rollno=p;
		name=q;
	}
	void put()
	{
		System.out.println("the value of rollno. is "+rollno);
		System.out.println("the value of rollno. is "+name);
		
	}
}

class test extends student
{
	int mt1,mt2;
	void getmarks(int r,int s)
	{
		get(12,"simran");
		mt1=r;
		mt2=s;
	}
	void putmarks()
	{
		put();	
		System.out.println("the value of rollno. is "+mt1);
		System.out.println("the value of rollno. is "+mt2);
		
	}
}

class result extends test
{
	int total;
	
	void display()
	{	getmarks(56,78);
		putmarks();
		total=mt1+mt2;	
		System.out.println("the value of rollno. is "+total);
		
		
	}
}

class argstudent
{
	public static void main(String args[])
	{
		result s1=new result();
		s1.display();
	}
}






