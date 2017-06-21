package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

@ManagedBean
@SessionScoped
public class CapeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private CampeonatoService service = new CampeonatoService();
	
	public void salvar()
	{
		service.save(campeonato);
		campeonato = new Campeonato();
	}

	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	public List<Campeonato> getCampeonatos() {
		return service.getList();
	}
}
