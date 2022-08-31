package tutorial_000.languageNewFeatures;

public class _002_SealedClasses {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Sealed Classes, that were a preview feature since java 15, are now realeased with java 17. As a reminder, Sealed Classes
		 * allow to control inheritance in Java. This new feature works as follow :
		 * 
		 * - A sealed class is declared using "sealed" keyword.
		 * - A sealed class allow to declare which class can inherit from it using "permits" keyword.
		 * - A class extending a sealed class must be declared as "sealed", "non-sealed" or "final".
		 * - The Java language recognizes sealed, non-sealed, and permits as contextual keywords (similar to abstract and extends).
		 * - Java restrict the ability to create local classes that are subclasses of a sealed class (similar to the inability to create 
		 *   anonymous classes of sealed classes).
		 * 
		 * This behavior helps to finely manage a finite and determinable hierarchy of classes in inheritance tree. For example we may :
		 * - Define "Employee", "Manager" and "RandomClass" classes
		 * - Define a "Person" sealed class that allow only "Employee" and "Manager" to inherit from it.
		 * 
		 * Here, "RandomClass" (or any class other than "Employee" or "Manager") will be allow to inherit from "Person".
		 * The inner classes below will show this behavior.
		 * 
		 */
		
		System.out.println("We will perform an allowed instanciation.");
		
		// This is allowed.
		Employee emp = new Employee();
		System.out.println("-------------");
		try {
			System.out.println("We will try a forbidden inheritance.");
			
			// This is forbidden (because "RandomClass" extends "Person") and will throw a "java.lang.IncompatibleClassChangeError".
			RandomClass rc = new RandomClass();
		} catch (IncompatibleClassChangeError e) {
			System.out.println("RandomClass extending Person is not allowed.");
			System.out.println(e.getMessage());
		}
	}
}

//Here, we define that "Person" class may be inherited only by "Employee" or "Manager" classes.
abstract sealed class Person permits Employee, Manager {}
	
// Here, "Employee" can inherit from "Person". We defined it as final because we must.
final class Employee extends Person {}
	
// Another example of allowed inheritance of "Person" class, for a non-sealed class.
non-sealed class Manager extends Person {}

// The following line will throw a warning in your IDE because "RandomClass" isn't allow to extends "Person".
final class RandomClass extends Person {}
