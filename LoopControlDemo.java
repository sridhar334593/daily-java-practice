import java.util.Scanner;

public class LoopControlDemo {
  public static void main(String[] args) {
    double n ,sum=0.0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number .Enter a negative number to stop:\n");
    
    while(true){
      n = scanner.nextDouble();
      if(n==0.0){
        break;
      }
      sum = sum+n;

    }
    System.out.println("sum is"  + sum);


  }
}
