package de.illilli.opendata.service.schuelerinnenundschueler;

public class SchuelerinnenUndSchuelerBezirk extends SchuelerinnenUndSchueler {

	private int nr;
	private String stadtBezirk;

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public String getStadtBezirk() {
		return stadtBezirk;
	}

	public void setStadtBezirk(String stadtBezirk) {
		this.stadtBezirk = stadtBezirk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + nr;
		result = prime * result + ((stadtBezirk == null) ? 0 : stadtBezirk.hashCode());
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
		SchuelerinnenUndSchuelerBezirk other = (SchuelerinnenUndSchuelerBezirk) obj;
		if (nr != other.nr)
			return false;
		if (stadtBezirk == null) {
			if (other.stadtBezirk != null)
				return false;
		} else if (!stadtBezirk.equals(other.stadtBezirk))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SchuelerinnenUndSchuelerStadtbezirk [nr=" + nr + ", stadtBezirk=" + stadtBezirk
				+ ", getAllgemeinbildendeSchule()=" + getAllgemeinbildendeSchule() + ", getGrundschule()="
				+ getGrundschule() + ", getHauptschule()=" + getHauptschule() + ", getRealschule()=" + getRealschule()
				+ ", getGymnasium()=" + getGymnasium() + ", getGesamtschule()=" + getGesamtschule()
				+ ", getFoerderschule()=" + getFoerderschule() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}

}
