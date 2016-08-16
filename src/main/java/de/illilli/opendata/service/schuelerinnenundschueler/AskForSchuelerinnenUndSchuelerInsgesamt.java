package de.illilli.opendata.service.schuelerinnenundschueler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.AskForCsv;
import de.illilli.opendata.service.Config;

public class AskForSchuelerinnenUndSchuelerInsgesamt extends AskForCsv<SchuelerinnenUndSchuelerInsgesamt>
		implements AskFor<List<SchuelerinnenUndSchuelerInsgesamt>> {

	private int year;

	String url = Config.getProperty("offenedaten.koeln.url");
	String postfix = Config.getProperty("offenedaten.koeln.schueler.insgesamt");

	private final CsvSchema simpleSchema = CsvSchema.builder() //
			.addColumn("stadtKoeln") //
			.addColumn("allgemeinbildendeSchule") //
			.addColumn("grundschule") //
			.addColumn("hauptschule") //
			.addColumn("realschule") //
			.addColumn("gymnasium") //
			.addColumn("gesamtschule") //
			.addColumn("foerderschule") //
			.build().withHeader();

	public AskForSchuelerinnenUndSchuelerInsgesamt(int year) throws MalformedURLException, IOException {
		super();
		this.year = year;
		this.clazz = SchuelerinnenUndSchuelerInsgesamt.class;
		mapData(getUrl(), getObjectReader(simpleSchema, clazz));
	}

	@Override
	protected URL getUrl() throws MalformedURLException {
		return new URL(url + "" + year + "" + postfix);
	}

}
