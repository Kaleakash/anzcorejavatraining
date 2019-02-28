import java.util.*;
class A{
	public String toString() {
		return "A class object";
	}
}
class B{
	public String toString() {
		return "B class object";
	}
}
class CollectionDemo {
	public static void main(String args[]) {
	HashSet hs = new HashSet();
		int a=10;
		Integer b = new Integer(a);	//converting int to Integer object 
	hs.add(b);
	hs.add(20);		//auto-boxing : converting primitive to Objects 
	hs.add(30.40);
	hs.add("Raj");
	A obj1 = new A();
	B obj2 = new B();
	hs.add(obj1);
	hs.add(obj2);
	System.out.println(hs);
	}
}