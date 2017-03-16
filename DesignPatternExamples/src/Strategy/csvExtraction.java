package Strategy;
class csvExtraction implements extraction {

	public void extract() {
		// complete the method below
		
		open();

		System.out.println("I will extract by seperating row by commas");

		close();
	}

	public void open() {

		System.out.println("Opening CSV file");
	}

	public void close() {

		System.out.println("Closing CSV file");
	}
}