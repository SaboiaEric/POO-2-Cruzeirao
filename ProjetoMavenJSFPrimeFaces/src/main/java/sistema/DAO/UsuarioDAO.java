package sistema.DAO;

import sistema.modelos.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario,Integer>{

	@Override
	protected Class<Usuario> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}

}
