package de.illilli.opendata.service.schuelerinnenundschueler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.google.gson.Gson;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Facade;

public class SchuelerinnenUndSchuelerStadtbezirkFacade implements Facade {

	private List<SchuelerinnenUndSchuelerBezirk> dataList;

	public SchuelerinnenUndSchuelerStadtbezirkFacade(int year) throws MalformedURLException, IOException {
		AskFor<List<SchuelerinnenUndSchuelerBezirk>> askFor = new AskForSchuelerinnenUndSchuelerBezirk(year);
		dataList = askFor.getData();
	}

	@Override
	public String getJson() {
		Gson gson = new Gson();
		return gson.toJson(dataList);
	}

}
