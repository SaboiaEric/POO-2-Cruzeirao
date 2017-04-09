package sistema.views;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.event.CloseEvent;
 
@ManagedBean
public class DialogView {
 
    public void destroyWorld() {
        addMessage("Inscrição confirmada", "Boa sorte para você e para tua equipe.");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}