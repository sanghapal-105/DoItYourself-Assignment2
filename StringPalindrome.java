import java.util.Scanner;
class StringPalindrome
{

	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter the string");
	String str=s1.nextLine();
	String rev="";
	int x=str.length();
	for(int i =x-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
	
		if(str.equals(rev))
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");
			
	}
}