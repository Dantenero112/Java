class TestingNestedIf2{
public static void main(String args[])
{int x=15;
if(x>10)if(x>15)if(x>20){
System.out.println("x is greater than 20");
}else{
System.out.println("x is not greater than 20");
}else{
System.out.println("x is not greater than 15");
}else{
System.out.println("x is not greater than 10");
}

}
}
