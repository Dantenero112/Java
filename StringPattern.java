class StringPattern
{
   int patternSearch(String st, String pattern){
   int result=-1,i=0;

   while(i<st.length()-pattern.length()){

   if(st.charAt(i)==pattern.charAt(0))
   {    int j=1;
    	while(j<pattern.length()){
    	if(pattern.charAt(j)!=st.charAt(i+j))
    		break;
    		j++; 
    	}
   	if(j==pattern.length()){
   	result=i;
   	break;
   	}
   }
   i++;
   }
   return result;
   }
   public static void main(String args[])
   {	StringPattern s=new StringPattern();
        String st="Lucknow Junction";
        String ps="n";
        System.out.println("Index: "+s.patternSearch(st,ps));
   }
}