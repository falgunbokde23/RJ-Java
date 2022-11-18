
public class Dog extends Animal{

	
	private String breed;
	
	Dog(){
		
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}

	@Override
	public void makeNoise() {
		
		System.out.println("Dog is making noise");
	}
	
	public void  play(){
		System.out.println("Dog is playing");
	}
}
