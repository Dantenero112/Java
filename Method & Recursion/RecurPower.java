import java.util.Scanner;
class RecurPower{
public long power(long n,long p){
long result=1;
for(int i=1;i<=p;i++){
result=result*n;
}	
return result;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Base:");
long a=sc.nextLong();
System.out.print("Enter the power:");
long b=sc.nextLong();
RecurPower ob=new RecurPower();
System.out.println("Result= "+ob.power(a,b));
}
}
