
// if a class implements an interface
// then class has to implement all the methods of the interface

public class LaserPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("printing in laser printer");
	}

	@Override
	public void init() {
		System.out.println("initialize  laser printer");

	}

	@Override
	public void pageSetup() {
		System.out.println("page setup for laser printer");

	}

}
