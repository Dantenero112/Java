import java.util.Scanner;
class RecurFact{
public long fact(int n){
//long result=1;
//for(int i=1;i<=n;i++){
//result=result*i;
//}
if(n==0||n==1) return 1;

return n*fact(n-1);	
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int a=sc.nextInt();
RecurSum ob=new RecurSum();
System.out.println("Result= "+ob.fact(a));
}
}
