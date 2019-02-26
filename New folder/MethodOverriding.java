class Bike {
	void speed() {
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
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Blue");
	}
	@Override
	void speed() {
			super.speed();		//calling super class speed method
		System.out.println("20km/hr");
	}
}
class MethodOverriding {
	public static void main(String args[]){
	Honda hh = new Honda();	hh.color();		hh.speed();
	Pulsar pu = new Pulsar();	pu.color();		pu.speed();
	Tvs tv = new Tvs();	tv.color();			tv.speed();
	}
}



