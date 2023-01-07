
public class Main {

	
	public static void main(String[] args) {
		
		Animal animal = new Cat();
		Animal animal1 = new Dog();
		
		animal.setName("Cow");
		((Cat) animal).jump();
		((Dog)animal1).play();
	}
	
}
