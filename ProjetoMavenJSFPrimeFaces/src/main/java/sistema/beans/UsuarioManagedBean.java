package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@SessionScoped
public class UsuarioManagedBean {

	private Usuario usuario = new Usuario();
	private UsuarioService service = new UsuarioService();
	private String nome;
	private String password;
	

	public UsuarioManagedBean() {
		super();
	}

	public String Entrar() {
		List<Usuario> usuarios = service.getUsuarios();
		for (Usuario uAux : usuarios) {

			if (uAux.getEmail().equals(nome)) {
				System.out.println("lalalalalla");
				if (uAux.getSenha().equals(password)) {
					usuario = uAux;
					return "newUsuario.xhtml";
				} else
					return "#";
			}
		}
		return "#";

	}

	public String salvar() {
		service.save(usuario);
		usuario = new Usuario();
		return "newLogin.xhtml";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return service.getUsuarios();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
