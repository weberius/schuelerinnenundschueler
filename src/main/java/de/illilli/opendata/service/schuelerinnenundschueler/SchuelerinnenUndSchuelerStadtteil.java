package de.illilli.opendata.service.schuelerinnenundschueler;

public class SchuelerinnenUndSchuelerStadtteil extends SchuelerinnenUndSchueler {

	private int nr;
	private String stadtTeil;

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getStadtTeil() {
		return stadtTeil;
	}

	public void setStadtTeil(String stadtTeil) {
		this.stadtTeil = stadtTeil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + nr;
		result = prime * result + ((stadtTeil == null) ? 0 : stadtTeil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SchuelerinnenUndSchuelerStadtteil other = (SchuelerinnenUndSchuelerStadtteil) obj;
		if (nr != other.nr)
			return false;
		if (stadtTeil == null) {
			if (other.stadtTeil != null)
				return false;
		} else if (!stadtTeil.equals(other.stadtTeil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SchuelerinnenUndSchuelerStadtteil [nr=" + nr + ", stadtTeil=" + stadtTeil
				+ ", getAllgemeinbildendeSchule()=" + getAllgemeinbildendeSchule() + ", getGrundschule()="
				+ getGrundschule() + ", getHauptschule()=" + getHauptschule() + ", getRealschule()=" + getRealschule()
				+ ", getGymnasium()=" + getGymnasium() + ", getGesamtschule()=" + getGesamtschule()
				+ ", getFoerderschule()=" + getFoerderschule() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}

}
