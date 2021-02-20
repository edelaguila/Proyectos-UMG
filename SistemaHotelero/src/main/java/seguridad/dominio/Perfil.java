
package seguridad.dominio;
/**
 *
 * @author Nay Ale
 */
public class Perfil {
  private int Pk_id_perfil;
    private String nombre_perfil;
    private String descripcion_perfil;
    private String estado_perfil;  

    public int getPk_id_perfil() {
        return Pk_id_perfil;
    }

    public void setPk_id_perfil(int Pk_id_perfil) {
        this.Pk_id_perfil = Pk_id_perfil;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    public String getDescripcion_perfil() {
        return descripcion_perfil;
    }

    public void setDescripcion_perfil(String descripcion_perfil) {
        this.descripcion_perfil = descripcion_perfil;
    }

    public String getEstado_perfil() {
        return estado_perfil;
    }

    public void setEstado_perfil(String estado_perfil) {
        this.estado_perfil = estado_perfil;
    }
    
    @Override
     
   public String toString() {    
    return "Perfil{" + "Pk_id_perfil=" + Pk_id_perfil + ", nombre_perfil=" + nombre_perfil + ", descripcion_perfil=" + descripcion_perfil + ", estado_perfil=" + estado_perfil + '}';
    } 
    public String DescripcionPerfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdperfil(int Pk_id_perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombrePerfil(String nombre_perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDescripcionPerfil(String descripcion_perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEstadoPerfil(String estado_perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombrePerfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDescripcionPerfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEstadoPerfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdperfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
        
