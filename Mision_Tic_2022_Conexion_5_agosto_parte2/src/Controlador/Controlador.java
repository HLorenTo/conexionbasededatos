package Controlador;

import Modelo.Conexion;
import Modelo.Persona;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {

    Conexion conectar = new Conexion();
    Connection connect = conectar.getConexion();

    private Persona mod;
    private Ventana vista;

    public Controlador(Persona mod, Ventana vista) {
        this.mod = mod;
        this.vista = vista;
        this.vista.btnconsultar.addActionListener(this);
        this.vista.btnguardar.addActionListener(this);
        this.vista.btnactu.addActionListener(this);
        this.vista.btneliminar.addActionListener(this);
    }

   // public Controlador(Persona modelo, Ventana vista) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    public void iniciar() {
        vista.setLocationRelativeTo(null); //centrar la ventana en medio de la pantalla
        vista.setTitle("MVC PERSONA BD");
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel model = (DefaultTableModel) vista.tabla.getModel();

        if (e.getSource() == vista.btnconsultar) {
            try {
                model.setRowCount(0);
                ResultSet rs = null;
                PreparedStatement pst = connect.prepareStatement("SELECT id,nombre,edad FROM persona"); //que vamos a declarar la query consultar
                rs = pst.executeQuery();

                while (rs.next()) {
                    model.addRow(new Object[]{rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad")});
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, "Conectese a la DB.");
            }
        } else if (e.getSource() == vista.btnguardar) {
            try {
                model.setRowCount(0);
                PreparedStatement pst = connect.prepareStatement("INSERT INTO persona (nombre,edad) VALUES (?,?)");
                pst.setString(1, vista.txtnombre.getText());
                pst.setInt(2, Integer.parseInt(vista.txtedad.getText()));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Datos guardados");

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, "Ingrese los datos a guardar.");
            }
        } else if (e.getSource() == vista.btneliminar) {
            try {
                model.setRowCount(0);
                PreparedStatement pst = connect.prepareStatement("DELETE FROM persona WHERE id=?");
                pst.setInt(1, Integer.parseInt(vista.txtid.getText()));
                pst.execute();
                JOptionPane.showMessageDialog(null, "Datos eliminados.");
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, "Ingrese el id a eliminar.");
            }
        } else if (e.getSource() == vista.btnactu) {
            try {
            model.setRowCount(0);
            PreparedStatement pst = connect.prepareStatement("UPDATE persona SET nombre=?, edad=? WHERE id=?");
            pst.setString(1, vista.txtnombre.getText());
            pst.setInt(2, Integer.parseInt(vista.txtedad.getText()));
            pst.setInt(3, Integer.parseInt(vista.txtid.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Datos actualizados.");
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctos");
        }
        }
    }
}