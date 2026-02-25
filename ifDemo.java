import java.util.Scanner;

public class ifDemo {
  public static void main(String[] args) {
    int num;

    Scanner sc = new Scanner(System.in);

    System.out.println("enter a number");
    num = sc.nextInt();

    if (num>0) {
      System.out.println(num + " is positive ");
    }
    else  {
      if (num==0) {
        System.out.println(num + " is neutral ");}
      else{
      
      System.out.println(num + " is negative");
    }
  }}}/*
  
      or use.... if{}
                 elif{}
                 else{}

                  "elif ladder"


  */
