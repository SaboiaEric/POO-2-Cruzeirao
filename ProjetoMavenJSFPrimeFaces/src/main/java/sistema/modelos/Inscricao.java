package sistema.modelos;

import java.util.ArrayList;
import java.util.Map;

public class Inscricao {
	private int registro;
	private String campeonato;
	private String categoria;
	private String time;
	private Map<Elenco,TipoElenco> jogadores;
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Map<Elenco, TipoElenco> getJogadores() {
		return jogadores;
	}
	public void setJogadores(Map<Elenco, TipoElenco> jogadores) {
		this.jogadores = jogadores;
	}
	
}
