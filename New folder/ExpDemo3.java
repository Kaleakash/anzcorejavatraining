class ExpDemo3 {
	static void dis1() throws Exception{
			//try{	
			int res = 10/0;
			//}catch(Exception e){}
			System.out.println("dis1() method");
	}
	static void dis2() throws Exception{
			//try{
			dis1();
			//}catch(Exception e){}
		System.out.println("dis2() method");
	}
	public static void main(String args[]) throws Exception{
		
			dis2();
		
		System.out.println("main method");	
	}
}