package co.unicauca.clientes.client;

import co.unicauca.clientes.controller.GUIBusquedaClientesController;
import co.unicauca.clientes.modelo.ClientesDB;
import co.unicauca.clientes.vista.GUIBusquedaClientes;
import co.unicauca.clientes.vista.GUIClientesProfesion;
import co.unicauca.clientes.vista.GUIEstadisticaPorSexo;
import co.unicauca.clientes.vista.GUIEstadisticaPorSexoGrafica;
/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano
 */
public class RunMVC {

    public RunMVC() {
        //create Model and View

        ClientesDB myModel = new ClientesDB();
        GUIBusquedaClientes Vista1 = new GUIBusquedaClientes(400, 50);
        
        GUIClientesProfesion Vista2 = new GUIClientesProfesion(400,250);
        
        GUIEstadisticaPorSexo Vista3 = new GUIEstadisticaPorSexo(400,460);

        GUIEstadisticaPorSexoGrafica Vista4 = new GUIEstadisticaPorSexoGrafica(800, 300);
        
        myModel.addObserver(Vista1);
        myModel.addObserver(Vista2);
        myModel.addObserver(Vista3);
        myModel.addObserver(Vista4);
        GUIBusquedaClientesController myController = new GUIBusquedaClientesController();
        myController.addModel(myModel);
        myController.addView(Vista1);
        Vista1.addController(myController);
    }

}
