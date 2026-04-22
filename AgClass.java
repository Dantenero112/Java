class AgClass implements Agreement{
	public void sort(int[] a){
	int temp;
	for(int i=1;i<a.length;i++){
	 for(int j=1;j<a.length-i+1;j++){
	 	if(a[j-1]>a[j])
	 	{
	  	temp=a[j-1];
	  	a[j-1]=a[j];
	  	a[j]=temp;
	 	}
	  }
	}
	}
}