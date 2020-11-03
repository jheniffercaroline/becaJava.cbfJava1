package model;

public class Jogador {
	public int Id;
	public String Nome;
	public int PosicaoId;
	public int ClubeId;

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

	public int getPosicaoId() {
		return PosicaoId;
	}

	public void setPosicaoId(int posicaoId) {
		PosicaoId = posicaoId;
	}

	public int getClubeId() {
		return ClubeId;
	}

	public void setClubeId(int clubeId) {
		ClubeId = clubeId;
	}
	
}
