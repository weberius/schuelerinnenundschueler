package de.illilli.opendata.service.schuelerinnenundschueler;

public abstract class SchuelerinnenUndSchueler {

	private int allgemeinbildendeSchule;
	private int grundschule;
	private int hauptschule;
	private int realschule;
	private int gymnasium;
	private int gesamtschule;
	private int foerderschule;

	public int getAllgemeinbildendeSchule() {
		return allgemeinbildendeSchule;
	}

	public void setAllgemeinbildendeSchule(int allgemeinbildendeSchule) {
		this.allgemeinbildendeSchule = allgemeinbildendeSchule;
	}

	public int getGrundschule() {
		return grundschule;
	}

	public void setGrundschule(int grundschule) {
		this.grundschule = grundschule;
	}

	public int getHauptschule() {
		return hauptschule;
	}

	public void setHauptschule(int hauptschule) {
		this.hauptschule = hauptschule;
	}

	public int getRealschule() {
		return realschule;
	}

	public void setRealschule(int realschule) {
		this.realschule = realschule;
	}

	public int getGymnasium() {
		return gymnasium;
	}

	public void setGymnasium(int gymnasium) {
		this.gymnasium = gymnasium;
	}

	public int getGesamtschule() {
		return gesamtschule;
	}

	public void setGesamtschule(int gesamtschule) {
		this.gesamtschule = gesamtschule;
	}

	public int getFoerderschule() {
		return foerderschule;
	}

	public void setFoerderschule(int foerderschule) {
		this.foerderschule = foerderschule;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + allgemeinbildendeSchule;
		result = prime * result + foerderschule;
		result = prime * result + gesamtschule;
		result = prime * result + grundschule;
		result = prime * result + gymnasium;
		result = prime * result + hauptschule;
		result = prime * result + realschule;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SchuelerinnenUndSchueler other = (SchuelerinnenUndSchueler) obj;
		if (allgemeinbildendeSchule != other.allgemeinbildendeSchule)
			return false;
		if (foerderschule != other.foerderschule)
			return false;
		if (gesamtschule != other.gesamtschule)
			return false;
		if (grundschule != other.grundschule)
			return false;
		if (gymnasium != other.gymnasium)
			return false;
		if (hauptschule != other.hauptschule)
			return false;
		if (realschule != other.realschule)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SchuelerinnenUndSchueler [allgemeinbildendeSchule=" + allgemeinbildendeSchule + ", grundschule="
				+ grundschule + ", hauptschule=" + hauptschule + ", realschule=" + realschule + ", gymnasium="
				+ gymnasium + ", gesamtschule=" + gesamtschule + ", foerderschule=" + foerderschule + "]";
	}

}
