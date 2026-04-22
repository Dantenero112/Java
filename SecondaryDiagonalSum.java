
class SecondaryDiagonalSum
{
   public static void main(String args[])
   { int sum=0;
	int[][] td={{1,2,3,4},{2,4,6,8},{10,20,30,40},{11,22,33,44}};
	for(int i=0;i<td.length;i++)
	{
	  for(int j=0;j<td[i].length;j++)
		{
		 if((i+j)==(td[i].length-1))
		 {sum+=td[i][j];
		 break;}
		}
	}  
	System.out.println("The sum of Secondary Diagonal is: "+sum);
   }
}