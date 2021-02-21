
package seguridad.datos;

import seguridad.dominio.Perfil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nay Ale
 */
public class PerfilDAO {
 private static final String SQL_SELECT = "SELECT * FROM tbl_perfil_encabezado";
 private static final String SQL_INSERT = "INSERT INTO tbl_perfil_encabezado(Pk_id_perfil, nombre_perfil, descripcion_perfil, estado_perfil) VALUES(?, ?, ?, ?)";
 private static final String SQL_UPDATE = "UPDATE tbl_perfil_encabezado SET Pk_id_perfil, nombre_perfil=?, descripcion_perfil=?, estado_perfil=? WHERE Pk_id_perfil = ?";
 private static final String SQL_DELETE = "DELETE FROM tbl_perfil_encabezado WHERE Pk_id_perfil=?";
 private static final String SQL_QUERY = "SELECT Pk_id_perfil, nombre_perfil, descripcion_perfil, estado_perfil FROM tbl_perfil_encabezado WHERE Pk_id_perfil = ?";
    
    Conexion conectar = new Conexion();
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Perfil perfil = null;
    
    public int insert(Perfil perfil){
        Connection conn = null;
        PreparedStatement stmt = null;
       
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, perfil.getPk_id_perfil());
            stmt.setString(2, perfil.getNombrePerfil());
            stmt.setString(3, perfil.getDescripcionPerfil());
            stmt.setInt(4, perfil.getEstadoPerfil());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }        
        return 1;
    }
    
    public int update(Perfil perfil){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
            //System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, perfil.getIdperfil());
            stmt.setString(2, perfil.getNombrePerfil());
            stmt.setString(3, perfil.getDescripcionPerfil());
            stmt.setInt(4, perfil.getEstadoPerfil());
            rows = stmt.executeUpdate();
            //System.out.println("Registros actualizado:" + rows);
            
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
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, perfil.getIdperfil());
            rows = stmt.executeUpdate();
            //System.out.println("Registros eliminados:" + rows);
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

    public List<Perfil> listar() {
        List<Perfil> perfiles = new ArrayList <>();
         try {
             conn=conectar.getConnection();
             stmt=conn.prepareStatement(SQL_SELECT);
             rs=stmt.executeQuery();
             while (rs.next()) {
                 Perfil usr= new Perfil();
                 usr.setPk_id_perfil(rs.getInt(1));
                 usr.setNombre_perfil(rs.getString(2));
                 usr.setDescripcion_perfil(rs.getString(3));
                 usr.getEstado_perfil(rs.getInt(4));
                 perfiles.add(usr);
             }
         }catch (Exception e){
         }
         return perfiles;
    }
    
}
