import java.util.Scanner;
public class ZeorsAtEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of the array:");
		     int size,i;
		     size=sc.nextInt();
		     int arr[ ]=new int[size];
		  System.out.println("Enter the Element of the array:");
		      for(i=0;i<size;i++)
		     {
		         arr[i]=sc.nextInt();
		     }
		      int c=0;

		      for(i=0;i<size;i++)
		      {
		          if(arr[i]!=0)
		          {
		              arr[c]=arr[i];
		              c++;
		          }
		      }
		      for(i=c;i<size;i++){
		          arr[c]=0;
		          c++;
		      }
		      System.out.println("New Array is:");
		      for(i=0;i<size;i++)
		      {
		    	  System.out.print(arr[i]+" ");
		      }
	          sc.close();
	}
}
