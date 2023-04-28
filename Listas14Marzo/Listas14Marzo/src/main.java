
import Controladores.ListaController;
import Modelos.ClientesModel;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO 2
 */
public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaListas = new frmPersonas(VistaPrincipal, true);
        ClientesModel ModeloLista = new ClientesModel();
        ListaController ControladorLista = new ListaController(VistaListas, VistaPrincipal, ModeloLista);
    }
    
}
