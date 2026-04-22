class FTester{
public static void main(String args[]){
FClass fc=new FClass();

//FInterface fi=new FInterface(){

/*fcl.m1(new FInterface(){

//Anonymous class
	public void printer(){
	System.out.println("Printer Method");
	 }
	});  */

//fc.m1(fi);

//Arrow Function
//fc.m1(()->System.out.println("Printer Method"));
//paranthesis are req in case of no argument function

fc.m1(x->System.out.println("Printer Method "+x),10); 
}
}