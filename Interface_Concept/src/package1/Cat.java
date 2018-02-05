package package1;

public class Cat implements Animal{
	
	/*
	 * A class can inherit from just one superclass, but can implement multiple interfaces.
	 * When you implement an interface, you need to override all of its methods.
	 */
	
	public void eat(){
		System.out.println("Cat eats.");
	}
	
	public void makeSound(){
		System.out.println("Cat sound");
	}

}
