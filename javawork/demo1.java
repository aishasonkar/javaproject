interface figure
{
	double pie=3.14;
	double half=0.5;
	abstract double  area(double x,double y);
}

class rectangle implements figure
{
	public double area(double l,double b)
	{
		return l*b;
	}
}

class triangle implements figure
{
	public double area(double b,double al)
	{
		return half*b*al;
	}
}

class circle implements figure
{
	public double area(double r,double l )
	{
		return pie*r*r;
	}
}

class demo1
{
	public static void main(String args[])
	{
		figure figref;
		figref =new rectangle();
		System.out.println("area of rectangle is "+figref.area(3.0,4.0));
		figref =new triangle();
		System.out.println("area of triangle is "+figref.area(5.0,6.0));
		figref =new circle();
		System.out.println("area of circle is "+figref.area(7.0,8.0));
	}
}
	