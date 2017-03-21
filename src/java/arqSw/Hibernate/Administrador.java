package arqSw.Hibernate;

public class Administrador  implements java.io.Serializable {


     private Integer idAdministrador;
     private String usuario;
     private String clave;

    public Administrador() {
    }

    public Administrador(String usuario, String clave) {
       this.usuario = usuario;
       this.clave = clave;
    }
   
    public Integer getIdAdministrador() {
        return this.idAdministrador;
    }
    
    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }




}


