package de.illilli.opendata.service.schuelerinnenundschueler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.google.gson.Gson;

import de.illilli.opendata.service.AskFor;
import de.illilli.opendata.service.Facade;

public class SchuelerinnenUndSchuelerStadtteilFacade implements Facade {

	private List<SchuelerinnenUndSchuelerStadtteil> dataList;

	public SchuelerinnenUndSchuelerStadtteilFacade(int year) throws MalformedURLException, IOException {
		AskFor<List<SchuelerinnenUndSchuelerStadtteil>> askFor = new AskForSchuelerinnenUndSchuelerStadtteil(year);
		dataList = askFor.getData();
	}

	@Override
	public String getJson() {
		Gson gson = new Gson();
		return gson.toJson(dataList);
	}

}
