class HwProg
{
   public static void main(String args[])
   {  //Pattern 1
	for(int i=1;i<=5;i++)
	{
	  for(int j=1;j<=5;j++)
	  {  if(j==1||j==5||i==1||i==5)
	     System.out.print("* ");
	     else
	     System.out.print("  ");
	  }
	  System.out.println();
	}
	
	System.out.println();
      //Pattern 2    
                 
      for(int i=5;i>=1;i--)
      { 
	for(int j=1;j<=5;j++)
	{  if (j<=i-1)
	   {
	    System.out.print("  ");
	   }
	   else
           {
	   System.out.print("* ");
	   }
	}
	System.out.println();
      } 

	System.out.println(); 
	//pattern 3
  
      for(int i=5;i>=1;i--)
       { 
	for(int j=1;j<=5;j++)
	{  if (j<=i-1)
	   {
	    System.out.print(" ");
	   }
	   else
           {
	   System.out.print("* ");
	   }
	}
	System.out.println();
       }  
  }
}