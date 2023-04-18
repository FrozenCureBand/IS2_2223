package es.unican.is2.seguros.common;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void testTotalSeguros() {

		Seguro seguro1 = new Seguro(75, "PLL9597", Cobertura.TODORIESGO, LocalDate.of(2022, 1, 1));
        Seguro seguro2 = new Seguro(80, "5678BBB", Cobertura.TERCEROS, LocalDate.of(2022, 1, 1));
	    
	    List<Seguro> seguros = new ArrayList<Seguro>();
	    seguros.add(seguro1);
	    seguros.add(seguro2);
	    
	    Cliente cliente = new Cliente(seguros, "Andrés Ortega", "12345678S", true);
	    
	    double totalSeguros = cliente.totalSeguros();
	    
	    assertEquals(221.4, totalSeguros, 0.001);
	}
}
