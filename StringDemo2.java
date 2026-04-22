class StringDemo2{
public static void main(String args[])
{
 String s1="Lucknow";
 /* char[] ca=s1.toCharArray();
 int i=0,j=ca.length-1;
 char temp;
 while(i<j)
 {
   temp=ca[i];
   ca[i]=ca[j];
   ca[j]=temp;
   i++; j--;

 }
 s1=new String(ca);
 System.out.println(s1);*/

 /*String ss1=s1.substring(4);
 String ss2=s1.substring(0,4); //4 is the offset which gets excluded
 String ss3=s1.substring(4,7); //offset 7, its not a length
 System.out.println(ss1);
 System.out.println(ss2);
System.out.println(ss3);*/
 
//split method
String s="Lucknow-Kanpur-Unnao";
String[] sa=s.split("-");
String[] sa2=s.split("an");

for(int i=0;i<sa.length;i++)
System.out.println(sa[i]);

for(int i=0;i<sa2.length;i++)
System.out.println(sa2[i]);
}
}
