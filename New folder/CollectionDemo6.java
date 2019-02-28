import java.util.*;
class CollectionDemo6 {
	public static void main(String args[]) {
	//Map hm = new HashMap();
	Map hm =new TreeMap();
		hm.put(2,"Raj");
	hm.put(1,"Ravi");
	hm.put(5,"Raju");
	hm.put(5,"Ramesh");
	hm.put(9,"Rajev");
	
	System.out.println(hm);
	hm.put(6,"Ajay");
	System.out.println(hm);
	hm.put(7,"Raj");
	System.out.println(hm);
	System.out.println("Value "+hm.get(2));
	}
}