package sistema.DAO;

import sistema.modelos.Equipe;

public class EquipeDAO extends GenericDAO<Equipe,Integer>{

	@Override
	protected Class<Equipe> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Equipe.class;
	}

}
