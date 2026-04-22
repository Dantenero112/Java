package mypkg;
class Data{
    int a=10;
    public int b=20;
    protected int c=30;
    private int d=40;
    public static void main(String[] args){
	Data ob = new Data();
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.c);
	System.out.println(ob.d);
	}
}