
class MutableStringDemo{
public static void main(String[] args){
StringBuilder sb=new StringBuilder(); //change the capacity from here
System.out.println(sb.length()); //gives 0 cuz no characters
System.out.println(sb.capacity()); //initially it contains capacity for 16 chars

//checking mutability
sb.append("Kanpur");
sb.append(" Junction");
sb.append(" East");
System.out.println(sb.length());
System.out.println(sb.capacity());
System.out.println(sb);

}
}