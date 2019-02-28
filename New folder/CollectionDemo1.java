import java.util.*;
class CollectionDemo1 {
	public static void main(String args[]) {
	//HashSet hs = new HashSet();
	//LinkedHashSet hs = new LinkedHashSet();
	TreeSet hs = new TreeSet();
	System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
	hs.add(20);		//Object 
		//hs.add("Raj");
	hs.add(30);
		hs.add(50);
		hs.add(50);
	hs.add(40);
	System.out.println("Size "+hs.size());
	System.out.println("Empty "+hs.isEmpty());
	System.out.println(hs);
	hs.remove(10);
	System.out.println(hs);
	System.out.println("Search "+hs.contains(40));
	System.out.println("Search "+hs.contains(400));	
		//hs.clear();
	System.out.println(hs);
	System.out.println("Using for each loop");
	for(Object a:hs) {
		System.out.println(a);
	}
	}
}