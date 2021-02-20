
package seguridad.datos;

import seguridad.dominio.Perfil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nay Ale
 */
public class PerfilDAO {
 private static final String SQL_SELECT = "SELECT Pk_id_perfil, nombre_perfil, descripcion_perfil, estado_perfil FROM tbl_perfil_encabezado1";
 private static final String SQL_INSERT = "INSERT INTO tbl_perfil_encabezado1(Pk_id_perfil, nombre_perfil, descripcion_perfil, estado_perfil) VALUES(?, ?, ?, ?)";
 private static final String SQL_UPDATE = "UPDATE tbl_perfil_encabezado1 SET nombre_perfil=?, descripcion_perfil=?, estado_perfil=? WHERE Pk_id_perfil = ?";
 private static final String SQL_DELETE = "DELETE FROM tbl_perfil_encabezado1 WHERE Pk_id_perfil=?";
 private static final String SQL_QUERY = "SELECT Pk_id_perfil, nombre_perfil, descripcion_perfil, estado_perfil FROM tbl_perfil_encabezado1 WHERE Pk_id_perfil = ?";
    
    public List<Perfil> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Perfil perfil = null;
        List<Perfil> perfiles = new ArrayList<Perfil>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int Pk_id_perfil = rs.getInt("Pk_id_perfil");
                String nombre_perfil = rs.getString("nombre_perfil");
                String descripcion_perfil = rs.getString("descripcion_perfil");
                String estado_perfil = rs.getString("estado_perfil");
                
                
                perfil = new Perfil();
                perfil.setIdperfil(Pk_id_perfil);
                perfil.setNombrePerfil(nombre_perfil);
                perfil.setDescripcionPerfil(descripcion_perfil);
                perfil.setEstadoPerfil(estado_perfil);
                
                
                perfiles.add(perfil);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return perfiles;
    }
    
    public int insert(Perfil perfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, perfil.getNombrePerfil());
            stmt.setString(2, perfil.getDescripcionPerfil());
            stmt.setString(3, perfil.getEstadoPerfil());
            
            
            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int update(Perfil perfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, perfil.getNombrePerfil());
            stmt.setString(2, perfil.getDescripcionPerfil());
            stmt.setString(3, perfil.getEstadoPerfil());
            stmt.setInt(4, perfil.getIdperfil());
            
            
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    
    public int delete(Perfil perfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, perfil.getIdperfil());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
      public int query(Perfil perfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;        
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setInt(1, perfil.getIdperfil());
            rs = stmt.executeQuery();
            while(rs.next()){
                int Pk_id_perfil = rs.getInt("Pk_id_perfil");
                String nombre_perfil = rs.getString("nombre_perfil");
                String descripcion_perfil = rs.getString("descripcion_perfil");
                String estado_perfil = rs.getString("estado_perfil");
       
                
                perfil = new Perfil();
                perfil.setIdperfil(Pk_id_perfil);
                perfil.setNombrePerfil(nombre_perfil);
                perfil.setDescripcionPerfil(descripcion_perfil);
                perfil.setEstadoPerfil(estado_perfil);
          
                rows++;             
            }
            System.out.println("Registros buscado:" + perfil);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }   
}
