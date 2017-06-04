package sistema.service;

import java.util.List;
import sistema.DAO.UsuarioDAO;
import sistema.modelos.Usuario;


public class UsuarioService {
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	public Usuario save(Usuario usuario){
		
		usuario = usuarioDAO.salvar(usuario);
		usuarioDAO.closeEntityManager();
		return usuario;
	}

	public List <Usuario> getLocals()
	{
		List <Usuario> list =  usuarioDAO.getAll(Usuario.class);
		usuarioDAO.closeEntityManager();
		return list;
	}
	public void update(Usuario usuario)
	{
		usuarioDAO.salvar(usuario);
		usuarioDAO.closeEntityManager();
	}
	public void remove(Usuario usuario)
	{
		try{
		usuario = usuarioDAO.getById(Usuario.class, usuario.getCodigoUsuario());
		usuarioDAO.remover(usuario);
		usuarioDAO.closeEntityManager();
		}
		catch(Exception e){
			System.out.println("Erro ao tentar remover usuário" + usuario.getNome());
		}
	}
}