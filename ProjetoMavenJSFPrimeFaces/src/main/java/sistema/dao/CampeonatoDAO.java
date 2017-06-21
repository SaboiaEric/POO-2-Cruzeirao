package sistema.DAO;

import sistema.modelos.Campeonato;

public class CampeonatoDAO extends GenericDAO<Campeonato,Integer>{

	@Override
	protected Class<Campeonato> getClasseEntidade() {
		return Campeonato.class;
	}

}
