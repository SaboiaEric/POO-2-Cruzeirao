package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Campeonato implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCampeonato;
	
	private String nome;
	private int ano;
	@OneToMany
	private ArrayList<Local> locais = new ArrayList<Local>();
	@OneToMany
	private ArrayList<Juiz> juizes= new ArrayList<Juiz>();
	@Temporal(TemporalType.DATE)
	private Date  dataInicioInscricao;
	@Temporal(TemporalType.DATE)
	private Date dataFimFimInscricao;
	@Temporal(TemporalType.DATE)
	private Date dataInicioCampeonato;
	@Temporal(TemporalType.DATE)
	private Date dataFimCampeonato;
	private double valorTaxa;
	private int minJogadores;
	private int maxJogadores;
	private int minTimeCat;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<Local> getLocais() {
		return locais;
	}
	public void setLocais(ArrayList<Local> locais) {
		this.locais = locais;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public Date getDataInicioInscricao() {
		return dataInicioInscricao;
	}
	public void setDataInicioInscricao(Date dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}
	public Date getDataFimFimInscricao() {
		return dataFimFimInscricao;
	}
	public void setDataFimFimInscricao(Date dataFimFimInscricao) {
		this.dataFimFimInscricao = dataFimFimInscricao;
	}
	public Date getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}
	public void setDataInicioCampeonato(Date dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}
	public Date getDataFimCampeonato() {
		return dataFimCampeonato;
	}
	public void setDataFimCampeonato(Date dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}
	public double getValorTaxa() {
		return valorTaxa;
	}
	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	public int getCodigoCampeonato() {
		return codigoCampeonato;
	}
	public void setCodigoCampeonato(int codigoCampeonato) {
		this.codigoCampeonato = codigoCampeonato;
	}
	public int getMinJogadores() {
		return minJogadores;
	}
	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}
	public int getMaxJogadores() {
		return maxJogadores;
	}
	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}
	public int getMinTimeCat() {
		return minTimeCat;
	}
	public void setMinTimeCat(int minTimeCat) {
		this.minTimeCat = minTimeCat;
	}	
}
