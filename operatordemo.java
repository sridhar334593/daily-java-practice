public class operatordemo {
  public static void main(String[] args) {
    int a=15,b=10,c=20;
    /*
    ..
    a=11++  error constants cannot be increment or decrement
    ..
     */
     a= a++ + ++a;
     int d=b++ + c++;
     int e=++b + ++c;
     int f=0,g=0;
     int h=--f * --g * --f * g--;

    System.out.println(a);
    System.out.println(d);
    System.out.println(e);
    System.out.println(h);
    System.out.println(a&1);//checks decimal value of 15=1111 and 1=0001 adds both and give result
   
  }
}
