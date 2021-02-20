/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.dominio;

/**
 *
 * @author Gerson
 */
public class Asignacion_Usuario {
private String PK_id_usuario;
    private String nombre_usuario;
    private String apellido_usuarios;
    private int estado_usuario; 
    
    public String getPK_id_usuario() {
        return PK_id_usuario;
    }

    public void setPK_id_usuario(String PK_id_usuario) {
        this.PK_id_usuario = PK_id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuarios() {
        return apellido_usuarios;
    }

    public void setApellido_usuarios(String apellido_usuarios) {
        this.apellido_usuarios = apellido_usuarios;
    }

    public int getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(int estado_usuario) {
        this.estado_usuario = estado_usuario;
    }
       
}
