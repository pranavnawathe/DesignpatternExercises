package Strategy;
class database implements data {

	public String whichDataType() {
		return "Database";
	}

	public void extractData() {

		// blank below
		new databaseExtraction().extract();
	}
}