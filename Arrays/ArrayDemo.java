class ArrayDemo
{
	public void printArray(int[] a)
	{
	 for(int i=0;i<a.length;i++)
	 System.out.print(a[i]+" ");
	 System.out.println();
	}
	public static void main(String args[])
	{
		int[] x=new int[5];
		int[] y={2,3,-1,7,2};
		int[] z=new int[]{2,10,-3,1,20};
		ArrayDemo ob=new ArrayDemo();
		ob.printArray(x);
		ob.printArray(y);
		ob.printArray(z);
	}
}
