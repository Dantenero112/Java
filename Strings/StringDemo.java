class StringDemo{
public static void main(String args[]){
 /*String s1="Lucknow";
 String s2="Lucknow";
 String s3=new String("Lucknow");
 String s4=new String("Lucknow");
 System.out.println((s1==s2));
 System.out.println((s1==s3));
 System.out.println((s3==s4));*/

 //Immutability

 /*System.out.println(s1);
 String s2=s1;
 System.out.println(s1==s2);
 s1=s1+" Junction";
 System.out.println(s1==s2);
 System.out.println(s2);
 System.out.println(s1);*/

 //String Methods

/*String s="Barabanki";
System.out.println(s.length());
String s2=s.concat(" City");
System.out.println(s);
System.out.println(s2);
System.out.println(s.indexOf('k'));
System.out.println(s.indexOf('B'));
System.out.println(s.indexOf('b'));
System.out.println(s.indexOf('a'));
System.out.println(s.lastIndexOf('a'));*/

/*String s="Lucknow";
for(int i=0;i<s.length();i++)
System.out.println(s.charAt(i));*/
/*String s=" Lucknow Junction ";
System.out.println(s.length());
s=s.trim();
System.out.println(s.length());
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());*/
 
String s1="Lucknow";
String s2=new String("LUCKNOW");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));

 }
}
