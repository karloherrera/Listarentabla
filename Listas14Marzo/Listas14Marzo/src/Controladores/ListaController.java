/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.ClientesModel;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ListaController implements ActionListener{
frmPersonas VistaLista;
frmPrincipal VistaPrincipal;
ClientesModel ModeloClientes;
public DefaultTableModel TablaClientes = new DefaultTableModel();


    public ListaController(frmPersonas VistaLista, frmPrincipal VistaPrincipal, ClientesModel ModeloClientes) {
        this.VistaLista = VistaLista;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloClientes = ModeloClientes;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnIngresar.addActionListener(this);
            this.VistaLista.btnAgregar.addActionListener(this);
            this.VistaLista.btnListar.addActionListener(this);   
        //LEVANTAR LA VISTA LISTAs
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaClientes.addColumn("Apellidos");
        this.TablaClientes.addColumn("Nombre");
        this.TablaClientes.addColumn("Telefono");
        
        this.VistaLista.jtListado.setModel(TablaClientes);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnIngresar)
        {
            this.VistaLista.setLocationRelativeTo(null);
            this.VistaLista.setVisible(true);
            
         
        }
        if(e.getSource() == this.VistaLista.btnAgregar){
        this.ModeloClientes.Listar(this.VistaLista.txtApellidos.getText(),
                   this.VistaLista.txtNombres.getText(), this.VistaLista.txtTelefono.getText());
        
        }
        if(e.getSource() == this.VistaLista.btnListar){
            
         this.TablaClientes.addRow(new Object[]{this.ModeloClientes.ListaCliente.get(0).getApellidos(),
           this.ModeloClientes.ListaCliente.get(0).getNombre(), 
           this.ModeloClientes.ListaCliente.get(0).getTelefono()});
    }
    }    
}

