package service;


import model.Jogador;
import repository.JogadorRepository;

public class JogadorService {

	public Jogador getJogador() {
		JogadorRepository repository = new JogadorRepository();
		return repository.getJogador();

	}

	public void setJogador(Jogador jogador) {
		JogadorRepository repository = new JogadorRepository();
		repository.setJogador(jogador);

	}
}
