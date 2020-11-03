package service;

import model.Campeonato;

import repository.CampeonatoRepository;


public class CampeonatoService {

	public Campeonato getCampeonato() {
		CampeonatoRepository repository = new CampeonatoRepository();
		return repository.getCampeonato();

	}

	public void setCampeonato(Campeonato campeonato) {
		CampeonatoRepository repository = new CampeonatoRepository();
		repository.setCampeonato(campeonato);

	}

}
