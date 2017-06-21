package sistema.enums;

public enum TipoUsuario {
	USUARIO("Usuario"), ADM("Adm"),  ORGANIZADOR("Organizador");
	
	public String tipoUsuario;

	TipoUsuario(String valor) {
		tipoUsuario = valor;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}
}
