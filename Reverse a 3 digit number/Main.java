import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int n1 = n%10;
    int n2= (n%100)/10;
    int n3= n/100;
    int N= (100*n1)+(10*n2)+(n3);
  System.out.println(N);
  }
}