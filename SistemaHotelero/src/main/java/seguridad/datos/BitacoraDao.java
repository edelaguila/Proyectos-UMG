
package seguridad.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import seguridad.dominio.Bitacora;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alberto Flores De Paz
 */

public class BitacoraDao extends Conexion {
    /**
 *
 *  declaracion estatico  de selec ,insert y query
 */
        
    private static final String SQL_SELECT = "SELECT PK_id_bitacora, PK_id_usuario, fecha,hora,ip,accion, tabla FROM tbl_bitacora";
          private static final String SQL_QUERY = "SELECT PK_id_bitacora, PK_id_usuario, fecha,hora,ip,accion, tabla FROM tbl_bitacora WHERE PK_id_usuario = ?";
  /**
 *
 * seleccion de  listas de  la bitacora
 */
          public List<Bitacora> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Bitacora usuario = null;
        List<Bitacora> usuarios = new ArrayList<Bitacora>();
        try {
            /**
 *
 * conecion con  sql de selecccion
 */
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                /**
 *
 * busqueda  de  datos  de la bitacocora en la  de usuarios
 */
                String id_bitacora = rs.getString("PK_id_bitacora");
                String id_usuario = rs.getString("PK_id_usuario");
                String fecha = rs.getString("fecha");
                String  hora = rs.getString("hora");
                 
              /**
 *
 * concatenacionde  de  variables de  de busqueda
 */
                String ip = rs.getString("ip");
                String accion = rs.getString("accion");
                String tabla = rs.getString("tabla");
               
                usuario = new Bitacora();
                usuario.setId_Bitacora(id_bitacora);
                usuario.setId_Usuario(id_usuario);
                 usuario.setFecha(fecha);
                usuario.setHora(hora);
                
                usuario.setIp(ip);
                 usuario.setAccion(accion);
                usuario.setTabla(tabla);
                

                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
         
            Conexion.close(conn);
        }
        

        return usuarios;
    }    
          
          /**
 *
 *  lista de la bitacora de  seleccion de datos a usuario
 */
          
 
          public Bitacora query(Bitacora usuario) {    
           /**
 *
 * conexion de base de  datos 
 */
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Bitacora> usuarios = new ArrayList<Bitacora>();
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, usuario.getId_Usuario());
            rs = stmt.executeQuery();
            while (rs.next()) {
                             /**
 *
 * busqueda  de  datos  de la bitacocora en la  de usuarios
 */
              String id_bitacora = rs.getString("PK_id_bitacora");
                String id_usuario = rs.getString("PK_id_usuario");
                String fecha = rs.getString("fecha");
                String  hora = rs.getString("hora");
             
                String ip = rs.getString("ip");
                String accion = rs.getString("accion");
                String tabla = rs.getString("tabla");
               
                            /**
 *
 * concatenacionde  de  variables de  de busqueda
 */
                usuario = new Bitacora();
                usuario.setId_Bitacora(id_bitacora);
                usuario.setId_Usuario(id_usuario);
                 usuario.setFecha(fecha);
                usuario.setHora(hora);
               
                usuario.setIp(ip);
                 usuario.setAccion(accion);
                usuario.setTabla(tabla);
                

                usuarios.add(usuario);
               
                
              
            }
            //System.out.println("Registros buscado:" + vendedor);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
          return usuario;
       
       
}
          
          
          
          
          
}

  
   

