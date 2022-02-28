import java.util.Scanner;
class MoveZeroToEnd
{

	public void m1(int test[], int n)
	{
		
		for(int i=0;i<n;i++)
		{
			if(test[i]==0)
			{
				for(int j=i+1;j<n;j++)
				{
					test[i]=test[j];
				}
				test[n-1]=0;
			}
			else
			test[i]=test[i];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(test[i]);
		}
		
	}
	public static void main(String args[])
	{
		int[] arr={3,2,0,7,0,0,8};
		int n=arr.length;
		MoveZeroToEnd obj =new MoveZeroToEnd();
		obj.m1(arr,n);
		
			
	}
}