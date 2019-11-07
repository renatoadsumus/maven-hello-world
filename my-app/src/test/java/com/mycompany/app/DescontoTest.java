package com.mycompany.app;

import org.junit.Test;

import junit.framework.TestCase;

public class DescontoTest extends TestCase{
	
	
	@Test
	public void testValorDaCompraEhMenoQue100NaoTemDesconto()
	{
		Desconto desconto = new Desconto();
		
		int resultadoEsperado = desconto.calcularValorDesconto(8);
		
		assertEquals(0,resultadoEsperado);
	}
	
	

}
