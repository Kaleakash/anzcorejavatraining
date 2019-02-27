class ExpDemo2 {
	public static void main(String args[]){
		try {
			int res = 10/Integer.parseInt(args[0]);
			System.out.println("No Exception");	
		}catch(ArithmeticException e){
			System.out.println("Arithmetic"+e.toString());
		}catch(NumberFormatException e) {
			System.out.println("NumberFormat"+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array"+e.toString());
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Bye...");
		System.out.println("Bye...");
		System.out.println("Bye...");
	}
}