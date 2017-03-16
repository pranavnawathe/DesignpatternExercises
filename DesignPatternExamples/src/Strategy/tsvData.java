package Strategy;
class tsvData implements data {

	public String whichDataType() {
		return "TSV";
	}

	public void extractData() {

		// blank below
		new tsvExtraction().extract();
	}
}
