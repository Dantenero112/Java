class NestedTester{
public static void main(String args[]){
Outer.Inner oi = new Outer().new Inner();
// The other way I found on Oracle, 
//create Outer Instance and then with the help of Outer Instance create Inner Instance
//new Outer().new Inner().show();
oi.show();
}
}

