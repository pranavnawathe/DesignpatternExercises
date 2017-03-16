package Strategy;
class tsvExtraction implements extraction {

	public void extract() {
		// complete the method below
		
		open();
		System.out.println("I will extract by seperating row by tabs");
		close();
	}

	public void open() {
		System.out.println("Opening TSV file");
	}

	public void close() {

		System.out.println("Closing TSV file");
	}
}