// polymorphism
// ability to have more than one implementation behind a single interface.
// design principle - open closed principle
// ms word application

public class ClientProgram {

	public static void main(String[] args) {
		
		Printer printer = new LaserPrinter();
		printer.init();
		printer.pageSetup();
		printer.print();
		
		printer = new InkjetPrinter();
		printer.init();
		printer.pageSetup();
		printer.print();
		
	}

}
