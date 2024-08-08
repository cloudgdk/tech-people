package java_inheritence;

public class BabyDog implements Dog,Animal{

	@Override
	public void bark() {
		System.out.println("I am puppy i can bark");
		
	}

	@Override
	public void eat() {
		System.out.println("I am Dog and Animal, SO i should eat");
		
	}

	
}
