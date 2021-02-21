
package seguridad.dominio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import seguridad.datos.PerfilDAO;
import seguridad.vista.MantenimientoPerfil;

/**
 *
 * @author Nay Ale
 */
public class ControladorPerfil {
    PerfilDAO dao = new PerfilDAO();
    Perfil usr = new Perfil();
    MantenimientoPerfil vista = new MantenimientoPerfil();
    DefaultTableModel modelo = new DefaultTableModel();
    
  public ControladorPerfil (MantenimientoPerfil v){
        this.vista=v;
        this.vista.btnBuscar.addActionListener((ActionListener) this);
        this.vista.btnGuardar.addActionListener((ActionListener) this);
  }
//@Override

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==vista.btnBuscar){
            listar(vista.jTable1);
        }
    }
       public void insert(){
        String id = vista.txt_IdPerfil.getText();
        String nom = vista.txt_NombreP.getText();
        String des = vista.txt_DescPerfil.getText();
        
        
    }
        public void listar(JTable Tabla){
        modelo=(DefaultTableModel)Tabla.getModel();
        List<Perfil>lista=dao.listar();
        Object[]object=new Object[5];
        for (int i = 0; i < lista.size(); i++){
            object[0]=lista.get(i).getPk_id_perfil();
            object[1]=lista.get(i).getNombre_perfil();
            object[2]=lista.get(i).getDescripcion_perfil();
            object[3]=lista.get(i).getEstado_perfil();
            
            modelo.addRow(object);
            
        }
        vista.jTable1.setModel(modelo);
    }

}
