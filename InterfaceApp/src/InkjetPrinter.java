
public class InkjetPrinter implements Printer {

	@Override
	public void print() {
		System.out.println("printing in inkjet printer");
	}

	@Override
	public void init() {
		System.out.println("initialize  inkjet printer");

	}

	@Override
	public void pageSetup() {
		System.out.println("page setup for inkjet printer");

	}

}
