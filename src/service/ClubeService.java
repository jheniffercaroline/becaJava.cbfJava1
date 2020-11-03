package service;

import model.Clube;

import repository.ClubeRepository;

public class ClubeService {

	public Clube getClube() {
		ClubeRepository repository = new ClubeRepository();
		return repository.getClube();

	}

	public void setClube(Clube clube) {
		ClubeRepository repository = new ClubeRepository();
		repository.setClube(clube);
	}
}