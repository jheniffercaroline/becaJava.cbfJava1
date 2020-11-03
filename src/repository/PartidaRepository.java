package repository;

import java.util.ArrayList;
import java.util.List;

import model.Partida;


public class PartidaRepository {
	
	public List<Partida> listaPartida = new ArrayList<Partida>();

	public Partida getPartida() {
		return new Partida();
	}

	public void setPartida(Partida partida) {

	}

}
