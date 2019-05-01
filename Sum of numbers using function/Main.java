import java.util.Scanner;
class Main{
  public static int sum_of_number(int n)
  {
    int i, sum=0;
    for(i=n;i>=0;i--)
    {
      sum=sum+i;
    }return sum;
    
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int son = sum_of_number(n);
      n = son;
      System.out.println(n);
      
	  
	}
}