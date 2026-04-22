class SortTester{
public static void main(String[] args){
int[] arr={3,5,2,1,4,8,6};
SortDemo sd=new SortDemo();
sd.doSort(new AgClass(), arr);
for(int i=0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
	}
System.out.println();
}
}