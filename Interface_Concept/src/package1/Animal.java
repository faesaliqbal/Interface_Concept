package package1;

public interface Animal {
	
	/*
	 * An interface is a completely abstract class that contains only abstract methods.
	 * it is defined using the interface keyword.
	 * may contain only static final variables.
	 * can not contain a constructor because interfaces can not be instantiated.
	 * Interfaces can extend other interfaces.
	 * A class can implement any number of interfaces.
	 */
	
	public void eat();
	public void makeSound();
	
	/*
	 * An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.
	 * Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
	 * Methods in an interface are implicitly public.
	 */

}
