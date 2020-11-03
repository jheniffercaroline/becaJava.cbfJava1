package model;

public class Partida {

	public int Id;
	public String MandanteId;
	public String VisitanteId;
	public int GolsMandante;
	public int GolsVisitante;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMandanteId() {
		return MandanteId;
	}

	public void setMandanteId(String mandanteId) {
		MandanteId = mandanteId;
	}

	public String getVisitanteId() {
		return VisitanteId;
	}

	public void setVisitanteId(String visitanteId) {
		VisitanteId = visitanteId;
	}

	public int getGolsMandante() {
		return GolsMandante;
	}

	public void setGolsMandante(int golsMandante) {
		GolsMandante = golsMandante;
	}

	public int getGolsVisitante() {
		return GolsVisitante;
	}

	public void setGolsVisitante(int golsVisitante) {
		GolsVisitante = golsVisitante;
	}

}
