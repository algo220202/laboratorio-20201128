package controlador;

import general.Sistema;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.SumarNumeros;
import modelo.Usuario;
import vista.frmIniciar;
import vista.frmSumar;

public class ControladorSumar {
    SumarNumeros modelo;
    frmSumar vista;

    public ControladorSumar(SumarNumeros modelo, frmSumar vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnSumar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setOperador1(Integer.valueOf(vista.txtOperador1.getText()));
                modelo.setOperador2(Integer.valueOf(vista.txtOperador2.getText()));
                modelo.sumar();
                vista.lblResultado.setText(String.valueOf(modelo.getSuma()));
            }
        });
        
        this.vista.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
                frmIniciar fInicio = new frmIniciar();
                ControladorInicio controlador = new ControladorInicio(Sistema.usuarios, fInicio);
                controlador.iniciar();
            }
        });
        this.vista.btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(vista, "Aqui implementaremos la funcionalidad de multiplicar");
            }
        });
        
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
