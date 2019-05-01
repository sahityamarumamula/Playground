import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int  t;
      if (n1>n2)
      {
        t = n1;
      }
        else
        {
          t= n2;
      }
      if (t>n3)
      {
        t=t;
      }
        else
        {
          t=n3;
      }
      System.out.println(t);   
    }
}
