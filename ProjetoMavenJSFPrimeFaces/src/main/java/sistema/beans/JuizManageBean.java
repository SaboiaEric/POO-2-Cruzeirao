package sistema.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import sistema.modelos.Juiz;
import sistema.service.JuizService;

import java.util.List;


@ManagedBean
@SessionScoped
public class JuizManageBean {
	private Juiz juiz = new Juiz();
	private JuizService service = new JuizService(); 
	
	public void salvar() {
		
		service.salvar(juiz);
		juiz = new Juiz();
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}
	
	public List<Juiz> getJuizes(){
		return service.getJuizes();
	}
		

}
