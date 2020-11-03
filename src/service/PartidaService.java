package service;

import model.Partida;

import repository.PartidaRepository;

public class PartidaService {

	public Partida getPartida() {
		PartidaRepository repository = new PartidaRepository();
		return repository.getPartida();

	}

	public void setPartida(Partida partida) {
		PartidaRepository repository = new PartidaRepository();
		repository.setPartida(partida);
}
}
