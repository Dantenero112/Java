class PolyDemo
{
int x;
int y;
/*Constructor
PolyDemo(){}
PolyDemo(int a){x=a;}
PolyDemo(int a, int b){x=a;y=b;}
void display(){System.out.println(x+" "+y);}*/
PolyDemo(int a,int b){x=a;y=b;}
int add(int a,int b){return a+b;}
int add(int a,int b, int c){ return a+b+c;}
}

class PolyTest{
  public static void main(String args[]){
  /*PolyDemo pd=new PolyDemo();
  PolyDemo pd2=new PolyDemo(10);
  PolyDemo pd3=new PolyDemo(15,30);
  pd.display();
  pd2.display();
  pd3.display();*/
  PolyDemo pd=new PolyDemo(10,20);
  int a=pd.add(pd.x,pd.y);
  int b=pd.add(pd.x,pd.y,30);
  System.out.println(a);
  System.out.println(b);
  }
}
