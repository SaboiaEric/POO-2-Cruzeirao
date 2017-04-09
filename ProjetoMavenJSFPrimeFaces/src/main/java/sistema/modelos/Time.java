package sistema.modelos;

import java.util.ArrayList;

public class Time {

	private String nome;
	private String status = "OK";
	private ArrayList<Time> times = new ArrayList<Time>();
	
	public Time(String nome){
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
		
		
	}
	
	
	
}
