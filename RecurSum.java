import java.util.Scanner;
class RecurSum{
public long sum(int n){
long result=0;
for(int i=1;i<=n;i++){
result=result+i;
}
return result;	
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int a=sc.nextInt();
RecurSum ob=new RecurSum();
System.out.println("Result= "+ob.sum(a));
}
}
