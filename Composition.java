package Main;

class Engine{
	void start() {
		System.out.println("engine is starting");
	}
	
}
class car1{
	//Engine e=new Engine();
	Engine e;
	void stop() {
		System.out.println(" engine is stoping");
		
	}
	void move() {
		e=new Engine();
		System.out.println("enine is moving");
		e.start();
	}
}

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car1 c=new car1();
		c.stop();
		c.move();

	}

}
