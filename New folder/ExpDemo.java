class ExpDemo {
	public static void main(String args[]){
			System.out.println("Hi");
			int a=10;
			int b=1;
			int abc[]={10,20,30,40};
		try{
		int res = a/b;		// new ArithmeticException();
		System.out.println("REs "+res);
		int res1 = 10/abc[5];
		System.out.println("REs "+res1);
		
		}catch(Exception e) {
			//System.out.println("I Take Care!");	
			System.out.println(e.toString());
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}
}