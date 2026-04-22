class PolyDemo2
{
int x;
int y;
PolyDemo2(){}
PolyDemo2(int a){x=a;}
PolyDemo2(int a, int b){this(a);y=b;}
void display(){System.out.println(x+" "+y);}

}
class PolyTest2{
public static void main(String args[]){
PolyDemo2 pd=new PolyDemo2(5,7);
pd.display();
}
}
