import java.util.*;
class ExceptionDemo1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr={3,21,34,54,22};
System.out.print("Enter the number of iterations: ");
int length=sc.nextInt();
	for(int i=0;i<length;i++){
	System.out.print(arr[i]+" ");
	}
}
}