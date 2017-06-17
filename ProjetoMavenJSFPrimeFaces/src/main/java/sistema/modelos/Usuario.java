package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import sistema.enums.Sexo;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"cpf"})})
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoUsuario;
	private String email;
	private String nome;
	private String senha;
	private String tipoUsuario = "NORMAL";

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Temporal(TemporalType.DATE)
	private Date dataNasimento;

	@ManyToMany(mappedBy = "diretores")
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();

	@OneToMany(mappedBy = "usuario")
	private ArrayList<Inscrito> inscricoes = new ArrayList<Inscrito>();
	@OneToMany
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();

	
	//private String telefoneFixo;
	//private String telefoneMovel;
	//private String endereco;
	//private String rg;
	@Column
	private String cpf;
	private String cref;

	private String sexo;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasimento() {
		return dataNasimento;
	}

	public void setDataNasimento(Date dataNasimento) {
		this.dataNasimento = dataNasimento;
	}

	public ArrayList<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}

	public ArrayList<Inscrito> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(ArrayList<Inscrito> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	
	
	
	
	

}
