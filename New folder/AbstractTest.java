abstract class Bike {
	abstract void speed();
}
abstract class Honda extends Bike {
	void color() {
		System.out.println("Black");
	}
	
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Red");
	}
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
}

class AbstractTest {
	public static void main(String args[]){
	//Honda hh = new Honda();	hh.color();		hh.speed();
	Pulsar pu = new Pulsar();	pu.color();		pu.speed();
	}
}



