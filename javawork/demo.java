import java.util.Scanner;
class student
{
	int rollno,pmarks,mmarks,cmarks,p,r,t,y;
	String name,q;
	student()
	{
		
	
	}
	student(int r,String q)
	{
		rollno=r;
		name=q;
	}
	student(int p,String q,int r,int t,int y)
	{
		rollno=r;
		name=q;
		pmarks=r;
		mmarks=t;
		cmarks=y;
	}
	
	
	void getdata(int p,String q,int r,int t,int y)
	{
		rollno=p;
		name=q;
		pmarks=r;
		mmarks=t;
		cmarks=y;
	}
	void getmarks(int r,int t,int y)
	{
		pmarks=r;
		mmarks=t;
		cmarks=y;
	}
		
	void display()
	{
		System.out.println("the value of roll. no is "+rollno);
		System.out.println("the value of roll. no is "+name);
		System.out.println("the value of roll. no is "+pmarks);
		System.out.println("the value of roll. no is "+mmarks);
		System.out.println("the value of roll. no is "+cmarks);
	}
}

class demo
{
	public static void main(String args[])
	{
		int u,w,j,z;
		String v;

		Scanner kb=new Scanner(System.in);
		System.out.println("enter the rollno.");
		u=kb.nextInt();
		System.out.println("enter the name.");
		v=kb.next();
		System.out.println("enter the physics marks ");
		w=kb.nextInt();
		System.out.println("enter the math marks ");
		j=kb.nextInt();
		System.out.println("enter the math marks ");
		z=kb.nextInt();
		
		student s1= new student();
		s1.getdata(12,"simg",67,89,68);
		s1.display();
		student s2= new student(11,"ghi");
		s2.getmarks(77,78,89);
		s2.display();
		student s3=new student(13,"hjk",66,37,89);
		s3.display();
	}
}
		

	
