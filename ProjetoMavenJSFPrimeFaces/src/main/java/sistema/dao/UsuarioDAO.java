package sistema.DAO;

import java.util.HashMap;
import java.util.Map;

import sistema.modelos.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario,Integer>{

	@Override
	protected Class<Usuario> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}
	public Usuario pesquisarPorUserName(String userName) {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("username", userName);

		return super.pesquisarUm(Usuario.PESQUISAR_POR_USERNAME, parametros);
}

}
