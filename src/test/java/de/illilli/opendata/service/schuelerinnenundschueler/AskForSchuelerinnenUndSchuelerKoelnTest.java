package de.illilli.opendata.service.schuelerinnenundschueler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.illilli.opendata.service.AskFor;

public class AskForSchuelerinnenUndSchuelerKoelnTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetData() throws MalformedURLException, IOException {
		AskFor<List<SchuelerinnenUndSchuelerInsgesamt>> askFor = new AskForSchuelerinnenUndSchuelerInsgesamt(2012);
		System.out.println(askFor.getData().size());
	}

}
