class MyClass{
	public int add(int x, int y){
	int z;
	z=x+y;
	return z;
	}
	public void printer(){
	System.out.println("Hello");
	} 
}
class MethodTester{
	public static void main(String args[])
	{
	  MyClass m=new MyClass();
	  int a=m.add(2,5);
	  m.printer();
	  System.out.println(a);
	}
}
