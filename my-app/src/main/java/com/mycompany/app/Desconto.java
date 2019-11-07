package com.mycompany.app;

public class Desconto {	
	

	public int calcularValorDesconto(int valorCompra) {		
		
		if(valorCompra > 100)
			return 10;
		
		return 0;
	}
	
}
