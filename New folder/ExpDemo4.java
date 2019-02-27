class ExpDemo4 {
	public static void main(String args[])  {
		int a=10;
		int b=5;
		try{
			//new ArithmeticException()		
			if(a>b) {
				throw new Exception();
			}

		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}