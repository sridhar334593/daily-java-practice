import java.util.Scanner;

public class switchOperator {
  public static void main(String[] args) {
    int a,b;
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter first number");
    a = scanner.nextInt();
    System.out.println("enter second number");
    b = scanner.nextInt();
    char operator;
    System.out.println("enter the operator +,-,*,/ or % :");
    operator = scanner.next().charAt(0);

    switch (operator) {
      case '+':
        System.out.println(a + " + " + b + " = " + (a+b));
        break;
      case '-':
        System.out.println(a + " - " + b + " = " + (a-b));
        break; 
      case '*':
        System.out.println(a + " * " + b + " = " + (a*b));  
        break;
      case '/':
        System.out.println(a + " / " + b + " = " + (a/b));
        break;
      case '%':
        System.out.println(a + " % " + b + " = " + (a%b));
        break;

        default:
          System.out.println("you entered incorrect operator");
          
    }

  }
}
