import java.util.Scanner;
class Main{
  public static int greatest_of_3_numbers(int n1,int n2,int n3)
  {
    int temp;
    if(n1>n2) 
    {
      temp=n1;
    }
    else
    {
    temp =n2;
    }
    if (n3>temp)
    {
    temp = n3;
    }
    else
    {
    temp= temp;
    }
    return temp;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
	int gon = greatest_of_3_numbers(n1,n2,n3);
      System.out.println(gon);
    }
}