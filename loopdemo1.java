import java.util.Scanner;

public class loopdemo1 {
  public static void main(String[] args) {
    int i=1;
    int n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("how many stars you want?");
    n=scanner.nextInt();
    
   /*  while (i<=n) {
      System.out.println("*");
      i++;
      
    } */
   do{
    System.out.println("*");
    i++;
   }while(i<=n);
    
  }
  

}
