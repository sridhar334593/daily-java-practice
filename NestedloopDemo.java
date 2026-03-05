public class NestedloopDemo {
  public static void main(String[] args) {
   
    outerloop:  //labels
    for(int i=1; i<=5; i++){
      innerloop: //labels
      for(int j=1; j<=5-i; j++){
        System.out.print(" ");
    }
    for(int k=1; k<=i; k++){
    System.out.print("* ");}
    System.out.println();
  }
  }
  
}
