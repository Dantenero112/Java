class MOuter{
int x=10;
	public void printer(){
	int y=10;
		class MInner{
		 public void show(){
	  	System.out.println("x="+x);
	  	System.out.println("y="+y);
	  	}
		}
	MInner mi=new MInner();
	mi.show();
	}
}