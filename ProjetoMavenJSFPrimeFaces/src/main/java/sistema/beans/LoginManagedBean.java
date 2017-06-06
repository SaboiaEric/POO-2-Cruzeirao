package sistema.beans;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
import sistema.DAO.UsuarioTesteDAO;
import sistema.modelos.UsuarioTeste;



@ManagedBean(name = "LoginMB")
@ViewScoped
public class LoginManagedBean {
	
	 private UsuarioTesteDAO usuarioDAO = new UsuarioTesteDAO();
     private UsuarioTeste usuario = new UsuarioTeste();
     
         
     public LoginManagedBean() {
		super();
	}

	public String envia() {
           
           usuario = usuarioDAO.getUsuarioTeste(usuario.getNomeUsuario(), usuario.getSenha());
           if (usuario == null) {
                 usuario = new UsuarioTeste();
                 FacesContext.getCurrentInstance().addMessage(
                            null,
                            new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                        "Erro no Login!"));
                 return null;
           } else {
                 return "/main";
           }
           
           
     }

     public UsuarioTeste getUsuario() {
           return usuario;
     }

     public void setUsuario(UsuarioTeste usuario) {
           this.usuario = usuario;

}
     
}
