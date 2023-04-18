package es.unican.is2.seguros.business;
import java.util.List;
import es.unican.is2.seguros.common.Cliente;
import es.unican.is2.seguros.common.IClientesDAO;
import es.unican.is2.seguros.common.IGestionClientes;
import es.unican.is2.seguros.common.IGestionSeguros;
import es.unican.is2.seguros.common.IInfoSeguros;
import es.unican.is2.seguros.common.ISegurosDAO;
import es.unican.is2.seguros.common.OperacionNoValida;
import es.unican.is2.seguros.common.Seguro;

public class GestionSeguros implements IInfoSeguros, IGestionSeguros, IGestionClientes{

	public GestionSeguros(IClientesDAO daoContribuyentes, ISegurosDAO daoVehiculos) {
		// TODO Auto-generated constructor stub
	}

	public Cliente nuevoCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente bajaCliente(String dni) throws OperacionNoValida {
		// TODO Auto-generated method stub
		return null;
	}

	public Seguro nuevoSeguro(Seguro s, String dni) throws OperacionNoValida {
		// TODO Auto-generated method stub
		return null;
	}

	public Seguro bajaSeguro(String matricula, String dni) throws OperacionNoValida {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente cliente(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	public Seguro seguro(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
