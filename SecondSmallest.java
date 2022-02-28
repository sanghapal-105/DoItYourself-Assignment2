import java.util.Scanner;

public class SecondSmallest {
  public static void main(String[] args) {

    int n, min;
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter size of the array : ");
    n = Sc.nextInt();

    // creating an array.
    int a[] = new int[n];

    // enter array elements.
    System.out.println("Enter the elements of array : ");
    for (int i = 0; i < n; i++) {
      a[i] = Sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          min = a[i];
          a[i] = a[j];
          a[j] = min;
        }
      }
    }
    System.out.println("The second smallest element in the array is :" + a[1]);
  }
}
