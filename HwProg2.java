import java.util.Scanner;
class HwProg2
{  	public void Fib(int n)// nth Term
	{  int n1=1,n2=1,n3=0; 
	   //n1,n2, and n3 are First, Second, and Third Term respectively
	   //if(n==1) return 1;
	   //if(n==2) return 1;
	   // Printing the Fibonacci Series upto Nth Term
	   for(int i=1;i<=n;i++)
		{ 
		  n3=n1+n2;
		  System.out.print(n1+" ");
		  n1=n2;
		  n2=n3;		 
		}
	}
  	 public static void main(String args[])
   	{ 
	  Scanner sc=new Scanner(System.in);
	  HwProg2 ob=new HwProg2();
	  System.out.print("Enter a number to find Nth Term of the Fibonacci Series:");
	  int a=sc.nextInt();
	  ob.Fib(a);
  	}
}