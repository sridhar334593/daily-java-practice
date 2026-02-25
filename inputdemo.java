
import java.util.Scanner;
import java.io.*;

public class inputdemo{
  public static void main(String[] args) {
    int a;
    Scanner scanner = new Scanner(System.in);
    System.out.println("what is your name?");
     String name = scanner.nextLine();
    System.out.println("what is your rating?");
     int rating = scanner.nextInt();
     scanner.nextLine();
    System.out.println("enter email:");
     String email = scanner.nextLine();
    System.out.println("hello " + name);
    System.out.println("you rated us " + rating);
    System.out.println("Email is " + email);


  }
}