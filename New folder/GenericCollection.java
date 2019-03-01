import java.util.*;
class GenericCollection {
	public static void main(String args[]) {
	/*List ll = new ArrayList();
	ll.add(10);			//object, auto-boxing 
	ll.add(10.10);
	ll.add("Raj");
	ll.add(20);
	

		Object obj	= ll.get(2);
		Integer i = (Integer)obj;	//type casting object to integer object. 
		int n = i.intValue();		// converting integer object to primitive 
		System.out.println("value of n is "+n);*/
	
	// List<Type> ll = new ArrayList<Type>();

	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	
	
			int n = ll.get(0);	//auto-unboxing : converting object to primitive 
			System.out.println(n);
	}
}


