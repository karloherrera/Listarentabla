/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ClientesModel {
   
public ArrayList<Clientes> ListaCliente = new ArrayList<Clientes>();
DefaultTableModel TablaCliente = new DefaultTableModel();
    public void Listar(String apellidos, String nombre, String telefono)
    {
        Clientes nuevoCliente = new Clientes(apellidos, nombre, telefono);
        this.ListaCliente.add(nuevoCliente);
    }
    
public DefaultTableModel ListarClientes(){
    this.TablaCliente.addColumn("APELLIDOS");
    this.TablaCliente.addColumn("NOMBRE");
    this.TablaCliente.addColumn("TELEFONO");
    for(int i=0; i<ListaCliente.size(); i++){
        TablaCliente.addRow(new Object[]{ListaCliente.get(i).apellidos,ListaCliente.get(i).nombre, ListaCliente.get(i).telefono});
    }
    return TablaCliente;
    }

}

