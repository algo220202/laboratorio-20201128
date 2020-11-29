
package controlador;

import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteArreglo;
import modelo.TipoCliente;
import vista.frmCliente;
import vista.frmIniciar;


public class ControladorCliente {
    private ClienteArreglo modelo;
    private frmCliente vista;

    public ControladorCliente(ClienteArreglo modelo, frmCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnAgregar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dni = vista.txtDNI.getText();
                String nombres = vista.txtNombres.getText();
                String paterno = vista.txtPaterno.getText();
                String materno = vista.txtMaterno.getText();
                String telefono = vista.txtTelefono.getText();
                String email = vista.txtEmail.getText();
               
                Cliente c = new Cliente(dni, nombres, paterno, materno, telefono, 
                                email, (TipoCliente)vista.cboTipoCliente.getSelectedItem() );
                Sistema.clientes.add(c);
                
                limpiar();
            }
        });
        
        this.vista.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sistema.usuarioConectado.salir();
                vista.dispose();
                
                frmIniciar fInicio = new frmIniciar();
                ControladorInicio controlador = new ControladorInicio(Sistema.usuarios, fInicio);
                controlador.iniciar();
                
                
            }
        });
        
        this.vista.btnTipoFiltro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel modelotabla = new DefaultTableModel( 
                            modelo.getDatosTabla((TipoCliente)vista.cboTipoClienteFiltro.getSelectedItem()), modelo.getCabecera());
                vista.tblClientes.setModel(modelotabla);
            }
        });
        
        
    }
    
    private void limpiar(){
        vista.txtDNI.setText("");
        vista.txtNombres.setText("");
        vista.txtPaterno.setText("");
        vista.txtMaterno.setText("");
        vista.txtTelefono.setText("");
        vista.txtEmail.setText("");
        vista.cboTipoCliente.setSelectedIndex(-1);
        
        DefaultTableModel modelotabla = new DefaultTableModel( modelo.getDatosTabla(), modelo.getCabecera());
        vista.tblClientes.setModel(modelotabla);
        
    }
    
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        DefaultComboBoxModel modelotipo = new DefaultComboBoxModel();
        for( TipoCliente tipo : Sistema.tipoclientes.getDatosCombo()){
            modelotipo.addElement(tipo);
        }
        vista.cboTipoCliente.setModel(modelotipo);
        vista.cboTipoClienteFiltro.setModel(modelotipo);
        limpiar();
        
    }
    
}
