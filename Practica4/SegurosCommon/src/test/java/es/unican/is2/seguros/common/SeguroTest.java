package es.unican.is2.seguros.common;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class SeguroTest {

	
	@Test
	public void testPrecio() {
		Seguro seguro1 = new Seguro(75, "PLL9597", Cobertura.TODORIESGO, LocalDate.of(2022, 1, 1));
        
        double precio1 = seguro1.precio();
        
        assertEquals(135.0, precio1, 0.001);
	}
}
