http://www.fredosaurus.com/notes-java/GUI/components/10labels/12labelfontcolor.html
class abc
{
public static void main(String args[])
{

int i,j,k;

//pt2.......................................
for(i=1;i<=5;i++)
{
 for(j=i;j<=5;j++)
{
  System.out.print("*");
}
for(k=i;k<=5;k++)
{
	System.out.print(" ");
}
 System.out.println("*");
}
//pt8........................................
for(i=5;i>=1;i--)
{
	for(j=5;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(k=1;k<=i;k++)
	{
		System.out.print("*");
	}
System.out.println();
}

}
}