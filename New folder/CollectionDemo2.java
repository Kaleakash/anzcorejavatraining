import java.util.*;
class CollectionDemo2 {
	public static void main(String args[]) {
	Stack ss = new Stack();
	ss.push(100);
	ss.push(200);
	ss.push(300);
	ss.push(400);
	System.out.println(ss);
	System.out.println("Pop "+ss.pop());
	System.out.println(ss);
	System.out.println("Peek "+ss.peek());
	System.out.println(ss);
	System.out.println(ss.search(1000));
	if(ss.search(300)!=-1) {
		System.out.println("Element is present");
	}else {
		System.out.println("Element is not present in stack");
	}
	}
}