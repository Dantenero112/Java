class AbstractMain{
public static void main(String args[]){
AbstractDemo2 ob=ConcreteDemo.getInstance(); 
ob.printer();
ob.display();
//ob.show(); error bcuz there is no show method in parent class
}
}