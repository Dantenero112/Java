class ArraySumDemo{
	public int sumArray(int[] a){
	 int temp=0;
	 for(int i=0;i<a.length;i++)
	 	temp=temp+a[i];
	 return temp;
	}
	public static void main(String args[])
	{
	int[] y={2,3,-1,7,2};
	ArraySumDemo ob=new ArraySumDemo();
	int result = ob.sumArray(y);
	System.out.println("Sum= "+result);
	}
}
