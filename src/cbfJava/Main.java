package cbfJava;

import java.util.ArrayList;
import java.util.List;

import model.Campeonato;
import model.Clube;
import model.Ingresso;
import model.Jogador;
import model.Partida;
import model.Posicao;

public class Main {

	public static void main(String[] args) {

		List<Posicao> listaPosicoes = new ArrayList<Posicao>();

		Posicao posicao = new Posicao();
		posicao.Id = 1;
		posicao.Nome = "";
		listaPosicoes.add(posicao);

		List<Campeonato> listaCampeonato = new ArrayList<Campeonato>();

		Campeonato campeonato = new Campeonato();
		campeonato.Id = 1;
		campeonato.Nome = "";
		campeonato.ClubeId = 1;
		campeonato.PartidaId = 1;
		listaCampeonato.add(campeonato);

		List<Clube> listaClube = new ArrayList<Clube>();

		Clube clube = new Clube();
		clube.Id = 1;
		clube.Nome = "";
		clube.Pontos = 1;
		listaClube.add(clube);

		List<Ingresso> listaIngresso = new ArrayList<Ingresso>();

		Ingresso ingresso = new Ingresso();
		ingresso.Id = 1;
		ingresso.Valor = 1;
		clube.Pontos = 1;
		listaIngresso.add(ingresso);

		List<Jogador> listaJogador = new ArrayList<Jogador>();

		Jogador jogador = new Jogador();
		jogador.Id = 1;
		jogador.Nome = "";
		jogador.PosicaoId = 1;
		jogador.ClubeId = 1;
		listaIngresso.add(ingresso);
		
		
		List<Partida> listaPartida = new ArrayList<Partida>();

		Partida partida = new Partida();
		partida.Id = 1;
		partida.MandanteId = "";
		partida.VisitanteId = "";
		partida.GolsMandante= 1;
		partida.GolsMandante= 1;
		listaIngresso.add(ingresso);


	}

}
