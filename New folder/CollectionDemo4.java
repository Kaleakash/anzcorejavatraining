import java.util.*;
class CollectionDemo4 {
	public static void main(String args[]) {
	LinkedList  ll = new LinkedList();
	ll.add(10);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	System.out.println(ll);
	ll.add(2,1000);
	System.out.println(ll);
	ll.addLast(1);
	ll.addFirst(1000);
	System.out.println(ll);
	}
}