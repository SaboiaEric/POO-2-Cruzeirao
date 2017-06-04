package sistema.DAO;

import sistema.modelos.Inscrito;

public class InscritoDAO extends GenericDAO<Inscrito, Integer>{

	@Override
	protected Class<Inscrito> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Inscrito.class;
	}

}
