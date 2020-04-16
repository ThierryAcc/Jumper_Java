package corona;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.vandermeer.asciitable.AsciiTable;

// CTRL + SHIFT + O
public class Corona {

	public static void main(String[] args) throws IOException {
		final String COUNTRIES = "countriesAndTerritories";
		final String CASES = "cases";
		final String DEATHS = "deaths";

		int casesRow = 0;
		int deathsRow = 0;
		int countriesAndTerritoriesRow = 0;

		// READ FILE
		List<String> lines = Files.readAllLines(new File("res/corona.csv").toPath(), Charset.defaultCharset());
		String[] linesArray = lines.toArray(new String[lines.size()]);

		// SEPARATE HEADER AND GET POSITION OF ROWS
		List<String> header = Arrays.asList(linesArray[0].split(","));
		for (int i = 0; i < header.size(); i++) {
			if (header.get(i).equals(CASES)) {
				casesRow = i;
			} else if (header.get(i).equals(DEATHS)) {
				deathsRow = i;
			} else if (header.get(i).equals(COUNTRIES)) {
				countriesAndTerritoriesRow = i;
			}
		}

		// ITERATE OVER ARRAY
		int cases = 0;
		int deaths = 0;
		String country = null;
		List<String> contentList;
		String[] filteredHeader = { COUNTRIES, CASES, DEATHS };
		List<String[]> finalArray = new ArrayList<>();
		finalArray.add(filteredHeader);

		for (int i = 1; i < linesArray.length; i++) {
			contentList = Arrays.asList(linesArray[i].split(","));
			for (int j = contentList.size() - 1; j > 0; j--) {
				if (j == casesRow) {
					cases += Integer.parseInt(contentList.get(j));
				} else if (j == deathsRow) {
					deaths += Integer.parseInt(contentList.get(j));
				} else if (j == countriesAndTerritoriesRow) {
					if (contentList.get(j).equals(country) || country == null) {
						country = contentList.get(j);
					} else {
						String[] myContent = { country, String.valueOf(cases), String.valueOf(deaths) };
						finalArray.add(myContent);
						cases = 0;
						deaths = 0;
						country = null;
					}
				}
			}
		}

		StringBuilder builder = new StringBuilder();

		builder.append(COUNTRIES);
		builder.append(" -- ");
		builder.append(CASES);
		builder.append(" -- ");
		builder.append(DEATHS);
		builder.append("\n");

		for (int i = 1; i < finalArray.size(); i++) {
			builder.append("Country: ");
			builder.append(finalArray.get(i)[0]);
			builder.append(", Cases: ");
			builder.append(finalArray.get(i)[1]);
			builder.append(", Deaths: ");
			builder.append(finalArray.get(i)[2]);
			builder.append("\n");
		}

		System.out.println(builder);

		AsciiTable at = new AsciiTable();

		at.addRule();
		at.addRow(COUNTRIES, CASES, DEATHS);
		at.addRule();

		for (int i = 1; i < finalArray.size(); i++) {
			at.addRule();
			at.addRow(finalArray.get(i)[0], finalArray.get(i)[1], finalArray.get(i)[2]);
		}
		System.out.print(at.render());

	}

}
