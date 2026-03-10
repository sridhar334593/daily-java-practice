import java.util.Scanner;
public class ArraysDemo2 {
  public static void main(String[] args) {
    int[] a = new int[6];
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter 6 numbers");
    for(int i=0; i<a.length; i++)
    a[i]=scanner.nextInt();

    for(int i=0; i<a.length;i++)
      System.out.println(a[i]);
    

  }
}
