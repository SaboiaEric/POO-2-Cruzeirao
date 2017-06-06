package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import sistema.modelos.Elenco;
import sistema.service.ElencoService;

@ManagedBean
@SessionScoped
public class ElencoManagedBean {
	
	private Elenco elenco = new Elenco();
	private ElencoService service = new ElencoService();
	
	
	public void salvar()
	{
		service.salvar(elenco);
		elenco = new Elenco();
		
	}

	public Elenco getElenco() {
		return elenco;
	}

	public void setElenco(Elenco elenco) {
		this.elenco = elenco;
	}

	public List<Elenco> getElencos() {
		return service.getElencos();
	}
}
