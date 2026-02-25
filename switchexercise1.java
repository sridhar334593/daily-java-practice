import java.util.Scanner;

public class switchexercise1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter an alphabet");
    char alphabet = sc.next().charAt(0);


    switch (alphabet) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("it is a vowel letter");
        break;
    
      default:
        System.out.println("it is a constant letter");
        break;
    }
  }
}
