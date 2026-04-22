
class MutableStringFunc{
public static void main(String[] args){
StringBuilder sb=new StringBuilder("Lucknow");
System.out.println(sb);

/*sb.reverse();
sb.insert(4,"for");  //inserts the string at position 4
System.out.println(sb);
sb.replace(7,10,"later");
System.out.println(sb);
sb.delete(4,7);
System.out.println(sb);*/

System.out.println(sb.length());
System.out.println(sb.capacity());
sb.trimToSize();
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.ensureCapacity(50);
System.out.println(sb.length());
System.out.println(sb.capacity()); //less than equal to 50

sb.setCharAt(6,'y');
System.out.println(sb);

}
}