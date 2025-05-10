import java.util.Scanner;
public class Main
{
      public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r=9;
	    int res;
	    if(n==0)
		   System.out.println("NULL");
		else
		for(int i=1;i<=n;i++)
		{
		    res=r*i;
		    System.out.print(res);
		    if(i!=n)
		    System.out.print(" ");
		}
	}
}
