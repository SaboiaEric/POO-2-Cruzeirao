package sistema.DAO;

import sistema.modelos.Elenco;

public class ElencoDAO extends GenericDAO<Elenco,Integer>{

	@Override
	protected Class<Elenco> getClasseEntidade() {
		return Elenco.class;
	}

}
