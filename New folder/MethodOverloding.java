class Abc {
	void add(int x, int y){
		System.out.println(x+y);
	}
	void add(int x, int y, int z){
		System.out.println(x+y+z);
	}
	void add(String s1, String s2) {
		System.out.println(s1+s2);
	}
}
class MethodOverloading {
	public static void main(String args[]) {
	Abc obj =new Abc();
	obj.add(1,2);
	obj.add("Raj","Deep");
	obj.add(2,3,4);
	}
}