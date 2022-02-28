import java.util.Scanner;

class ReverseString
{


	public void m1(String n)
	{
		System.out.println("reverse string is");
		for(int i=n.length();i>0;i--)
		{
			System.out.print(n.charAt(i-1));
			
		}
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the string");
	String str=s1.nextLine();
	ReverseString ob1 = new ReverseString();
	ob1.m1(str);
	}

}