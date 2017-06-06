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
	
	public UsuarioManagedBean() {
		super();
	}

	public void salvar()
	{
		service.save(usuario);
		usuario = new Usuario();
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
	
}
