import java.util.Scanner;
class Main
{
  public static int square_of_number(int n)
  {
  int square = n *n;
  
  return square;
  }
	public static void main (String[] args)
    {
	Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      {
      int son = square_of_number(n);
      n=son ;
      }
	System.out.println(n);
    } 
}