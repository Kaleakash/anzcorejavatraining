class MyException extends Exception{
	MyException() {

	}
	MyException(String str){
		super(str);		//to call Exception parameterized constructor
	}
}
class ExpDemo5 {
	public static void main(String args[])  {
		int a=10;
		int b=5;
		try{
			//new ArithmeticException()		
			if(a>b) {
				//throw new Exception();
				//throw new ArithmeticException();
				//throw new ArithmeticException("a>b");
								//int res = 10/0;	
				//throw new MyException();
				throw new MyException("a>b");
			}

		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}