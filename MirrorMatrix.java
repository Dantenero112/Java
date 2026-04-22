class MirrorMatrix
{
   public static void printArray(int n[][]){
	for(int i=0;i<n.length;i++)
	{ for(int j=0;j<n[i].length;j++)
	  System.out.print(n[i][j]+" ");
	  System.out.println();
	}
	}
   public static void mirror(int[][] n){
	int temp=0;
	for(int i=0;i<n.length;i++)
	{ int l=n[i].length;
	  for(int j=0;j<l;j++)
		{
		 temp=n[i][j];
		 n[i][j]=n[i][l-1];
		 n[i][l-1]=temp;
		 l--;
		}
	}  
}
   public static void main(String args[])
   { 
	int[][] td={{1,2,3,4},{2,4,6,8},{10,20,30,40},{11,22,33,44}};
	printArray(td);
	System.out.println("Mirror Matrix:");
	mirror(td);
	printArray(td);
   }
}