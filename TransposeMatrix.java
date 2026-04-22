
class TransposeMatrix
{
   public static void printArray(int n[][]){
	for(int i=0;i<n.length;i++)
	{ for(int j=0;j<n[i].length;j++)
	  System.out.print(n[i][j]+" ");
	  System.out.println();
	}
	}
   public static void transpose(int[][] n){
	int temp=0;
	for(int i=0;i<n.length;i++)
	{
	  for(int j=i;j<n[i].length;j++)
		{temp=n[i][j];
		 n[i][j]=n[j][i];
		n[j][i]=temp;
		}
	}  
}
   public static void main(String args[])
   { 
	int[][] td={{1,2,3,4},{2,4,6,8},{10,20,30,40},{11,22,33,44}};
	printArray(td);
	System.out.println("Transpose Matrix:");
	transpose(td);
	printArray(td);
   }
}