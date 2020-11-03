package repository;

import java.util.ArrayList;
import java.util.List;

import model.Ingresso;


public class IngressoRepository {

	public List<Ingresso> listaIngresso = new ArrayList<Ingresso>();

	public Ingresso getClube() {
		return new Ingresso();
	}

	public void setIngresso(Ingresso ingresso) {

	}

}
