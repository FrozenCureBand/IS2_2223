package es.unican.is2.seguros.main;

import es.unican.is2.seguros.business.GestionSeguros;
import es.unican.is2.seguros.common.IClientesDAO;
import es.unican.is2.seguros.common.ISegurosDAO;
import es.unican.is2.seguros.dao.ClientesDAO;
import es.unican.is2.seguros.dao.SegurosDAO;
import es.unican.is2.seguros.gui.VistaAgente;

public class Runner {

	public static void main(String[] args) {
		IClientesDAO daoContribuyentes = new ClientesDAO();
		ISegurosDAO daoVehiculos = new SegurosDAO();
		GestionSeguros negocio = new GestionSeguros(daoContribuyentes, daoVehiculos);
		VistaAgente vista = new VistaAgente(negocio, negocio, negocio);
		vista.setVisible(true);
	}

}
