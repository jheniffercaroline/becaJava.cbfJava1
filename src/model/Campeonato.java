package model;

public class Campeonato {
	public int Id;
	public String Nome;
	public int ClubeId;
	public int PartidaId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getClubeId() {
		return ClubeId;
	}

	public void setClubeId(int clubeId) {
		ClubeId = clubeId;
	}

	public int getPartidaId() {
		return PartidaId;
	}

	public void setPartidaId(int partidaId) {
		PartidaId = partidaId;
	}

}
