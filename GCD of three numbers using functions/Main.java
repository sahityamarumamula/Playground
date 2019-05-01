import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	   Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.println(gcd_of_3_numbers(n1,n2,n3));
	}
  public static int gcd_of_3_numbers(int n1,int n2,int n3)
  {
    int min_element, gcd;
    if(n1>n2)
    {
    min_element = n1;
    }
    else
    {
    min_element = n2;
    }
    if(n3>min_element)
    {
    min_element = n3;
    }
    else
    {
    min_element = min_element;
    }
    while (min_element>=1)
    {
    
    if((n1%min_element==0)&&(n2%min_element==0)&&(n3%min_element==0))
    { 
      
        
       gcd = min_element;
       break;
    }
      min_element--;
    
    }
      return min_element;
    
    }
}
