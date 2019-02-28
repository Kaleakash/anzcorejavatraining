import java.util.*;
class CollectionDemo3 {
	public static void main(String args[]) {
	//int abc[]={10,200,30,40};	int abc[]=new int[10];
	ArrayList al = new ArrayList();
	al.add(20);
	al.add(10);
	al.add(30);
	al.add(40);
	System.out.println(al);
	System.out.println("Get element using index position "+al.get(1));
		al.add(1,100);
	System.out.println("Get element using index position "+al.get(1));
	System.out.println("Get element using index position "+al.get(2));
	al.remove(2);		//using index position 
	al.remove(new Integer(40));	//using value 
	System.out.println(al);
	}
}