//final class Bike {
class Bike{
	final void speed(){
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	void color() {
		System.out.println("Black");
	}
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Red");
	}
	/*@Override
	void speed() {
		System.out.println("90km/hr");
	}*/
}
class FinalTest {
	public static void main(String args[]){
	Pulsar pu = new Pulsar();	pu.color();		pu.speed();
	final int A=10;
	System.out.println(A);
	//A=20;
	System.out.println(A);
	}
}



