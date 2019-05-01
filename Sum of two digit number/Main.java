import java.util.*;
class Main {
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int d1= n/10;
      int d2=n%10;
      int sum = d1+d2;
      System.out.println(sum);
	}
}