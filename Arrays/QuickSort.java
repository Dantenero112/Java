
class QuickSort
{
   public static void quick(int ar[])
   {
    int i=0,j=ar.length-1,temp,el1,el2;
    while(i<=j){
         int pivot=ar[i];
         while(pivot<=ar[j])
	}
   }
   public static void printArray(int ar[])
   {
	for(int i=0;i<ar.length;i++)
	System.out.print(ar[i]+" ");
	System.out.println();
   }
   public static void main(String args[])
   {
	int[] arr={0,1,1,0,1,0,1,0,1,0};
        printArray(arr);
	System.out.println("Quick Sort");
        quick(arr);
	printArray(arr);
   }
}