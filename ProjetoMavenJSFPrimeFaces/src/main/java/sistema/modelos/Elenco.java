package sistema.modelos;

import java.util.Date;

public class Elenco {


	private String documento;
	private String nome;
	private Date dataNascimento;
	private TipoEnum tipo;
	private String time;
	
	public static enum TipoEnum{
		Jogador,
		Tecnico,
		PreparadorFisico,
		Massagista
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


}
