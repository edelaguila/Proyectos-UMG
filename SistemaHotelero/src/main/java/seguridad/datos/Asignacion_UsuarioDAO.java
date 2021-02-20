/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import seguridad.dominio.Asignacion_Usuario;

/**
 *
 * @author Gerson
 */
public class Asignacion_UsuarioDAO {
    private static final String SQL_SELECT = "SELECT PK_id_usuario, nombre_usuario, apellido_usuarios, estado_usuario FROM tbl_usuario";  
    
    public List<Asignacion_Usuario> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Asignacion_Usuario usuarios = null;
        List<Asignacion_Usuario> usuario = new ArrayList<Asignacion_Usuario>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                String PK_id_usuario = rs.getString("PK_id_usuario");
                String nombre_usuario = rs.getString("nombre_usuario");
                String apellido_usuarios = rs.getString("apellido_usuarios");
                int estado_usuario = rs.getInt("estado_usuario");
                
                usuarios = new Asignacion_Usuario();
                usuarios.setPK_id_usuario(PK_id_usuario);
                usuarios.setNombre_usuario(nombre_usuario);
                usuarios.setApellido_usuarios(apellido_usuarios);
                usuarios.setEstado_usuario(estado_usuario);
                
                
                usuario.add(usuarios);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return usuario;
        
}
}
