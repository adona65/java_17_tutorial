package tutorial_000.languageNewFeatures;

public class _000_MiscellaneousChanges {
	/*
	 * Java 17 delivered various changes concerning Java. Here are some.
	 */
	
	/*
	 * Enhanced Pseudo-Random Number Generators
	 * 
	 * Java 17 provides new interfaces and implementations for Pseudo-Random Number Generators (PRNG). It is now easier to use different algorithms 
	 * interchangeably, and it also offers better support for stream-based programming. More details at : https://openjdk.org/jeps/356.
	 * 
	 * Legacy random classes, such as java.util.Random, SplittableRandom and SecureRandom now extend the new RandomGenerator interface.
	 */
	
	/*
	 * New macOS Rendering Pipeline
	 * 
	 * Java now implements a Java 2D internal rendering pipeline for macOS since Apple deprecated the OpenGL API (in macOS 10.14), used internally 
	 * in Swing GUI. The new implementation uses the Apple Metal API, and apart from the internal engine, there were no changes to the existing APIs.
	 */
	
	/*
	 * Strongly Encapsulate JDK Internals
	 * 
	 * Java 17 removes the flag -illegal-access. The platform will ignore the flag, and if the flag is present, the console will display a message 
	 * informing the discontinuation of the flag.
	 * 
	 * This feature will prevent JDK users from accessing internal APIs, except for critical ones like sun.misc.Unsafe.
	 */
	
	/*
	 * Vector API (Second Incubator)
	 * 
	 * The Vector API deals with the SIMD (Single Instruction, Multiple Data) type of operation, meaning various sets of instructions executed in 
	 * parallel. It leverages specialized CPU hardware that supports vector instructions and allows the execution of such instructions as pipelines.
	 * 
	 * As a result, the new API will enable developers to implement more efficient code, leveraging the potential of the underlying hardware.
	 * 
	 * Everyday use cases for this operation are scientific algebra linear applications, image processing, character processing, and any heavy 
	 * arithmetic application or any application that needs to apply an operation for multiple independent operands.
	 */
}
