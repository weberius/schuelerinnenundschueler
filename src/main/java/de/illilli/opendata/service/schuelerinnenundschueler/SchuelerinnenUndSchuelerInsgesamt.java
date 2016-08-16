package de.illilli.opendata.service.schuelerinnenundschueler;

public class SchuelerinnenUndSchuelerInsgesamt extends SchuelerinnenUndSchueler {

	private String stadtKoeln;

	public String getStadtKoeln() {
		return stadtKoeln;
	}

	public void setStadtKoeln(String stadtKoeln) {
		this.stadtKoeln = stadtKoeln;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stadtKoeln == null) ? 0 : stadtKoeln.hashCode());
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
		SchuelerinnenUndSchuelerInsgesamt other = (SchuelerinnenUndSchuelerInsgesamt) obj;
		if (stadtKoeln == null) {
			if (other.stadtKoeln != null)
				return false;
		} else if (!stadtKoeln.equals(other.stadtKoeln))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SchuelerinnenUndSchuelerInsgesamt [stadtKoeln=" + stadtKoeln + "]";
	}

}
