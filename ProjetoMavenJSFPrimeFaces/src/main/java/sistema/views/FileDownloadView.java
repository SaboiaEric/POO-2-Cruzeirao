package sistema.views;
 
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
 
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
 
@ManagedBean
public class FileDownloadView {
     
    private StreamedContent file;
     
    public FileDownloadView() {        
        InputStream stream = FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/src/main/webapp/resources/sistema/1_0/imagens/downloaded_optimus.jpg");
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus_teste.jpg");
    }
 
    public StreamedContent getFile() {
        return file;
    }
}