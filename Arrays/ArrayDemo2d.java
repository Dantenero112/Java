
class ArrayDemo2d
{
   public static void main(String args[])
   {
	int[][] td={{5,10,15,20},{1,2,3,4},{2,4,6,8},{3,5,7,9}};
	for(int i=0;i<td.length;i++)
	{
	  for(int j=0;j<td[i].length;j++)
	  {
	     System.out.print(td[i][j]+" ");
	  }
	  System.out.println();
	}  
   }
}
