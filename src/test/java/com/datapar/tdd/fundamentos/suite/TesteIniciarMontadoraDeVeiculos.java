package com.datapar.tdd.fundamentos.suite;

import org.junit.Before;
import org.junit.Test;

import com.datapar.tdd.fundamentos.bussines.MontadoraDeVeiculos;
import com.datapar.tdd.fundamentos.exceptions.ExceptionLimiteMontagem;

public class TesteIniciarMontadoraDeVeiculos {

	private MontadoraDeVeiculos montadora;

	@Before
	public void criarMontadora(){
		montadora=MontadoraDeVeiculos.of();
	}
	
	@Test(expected = ExceptionLimiteMontagem.class)
	public void testeIniciarMontadoraComCapacidadeAbaixoDaMinima() throws Exception {
		
		montadora.iniciarMontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMinimaDeVeiculosAMontar()-1);
		
	}

	@Test(expected = ExceptionLimiteMontagem.class)
	public void testeIniciarMontadoraComCapacidadeAcimaDoLimite() throws Exception {
		
		montadora.iniciarMontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
		
	}
	
}
