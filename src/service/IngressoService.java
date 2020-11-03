package service;

import model.Ingresso;
import repository.IngressoRepository;

public class IngressoService {

	public Ingresso getIngresso() {
		IngressoRepository repository = new IngressoRepository();
		return repository.getClube();

	}

	public void setIngresso(Ingresso ingresso) {
		IngressoRepository repository = new IngressoRepository();
		repository.setIngresso(ingresso);

	}
}
