package sistema.DAO;

import sistema.modelos.Equipe;

public class EquipeDAO extends GenericDAO<Equipe,Integer>{

	@Override
	protected Class<Equipe> getClasseEntidade() {
		return Equipe.class;
	}

}
