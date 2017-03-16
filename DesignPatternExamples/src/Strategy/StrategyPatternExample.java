package Strategy;

import java.util.Scanner;

public class StrategyPatternExample {

	public static void main(String[] args) {
	
		System.out.println("Select one of the data types(d-Database/c-CSV/t-TSV): ");
		Scanner sc = new Scanner(System.in);
		String datatype = sc.nextLine();

		data data = null;
		switch (datatype) {
		case "d":
			data = new database();
			break;
		case "c":
			data = new csvData();
			break;
		case "t":
			data = new tsvData();
			break;
		}
		
		data.extractData();
		sc.close();
	}
}





