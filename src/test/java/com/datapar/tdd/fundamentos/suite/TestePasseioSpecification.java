package com.datapar.tdd.fundamentos.suite;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Test;

import com.datapar.tdd.fundamentos.model.Passeio;
import com.datapar.tdd.fundamentos.specification.PasseioConversivelSpecification;
import com.datapar.tdd.fundamentos.specification.PasseioCorSpecification;
import com.datapar.tdd.fundamentos.specification.generics.Specification;

public class TestePasseioSpecification {

	@Test
	public void testFindCandidateCars() throws Exception {

		PasseioCorSpecification spec = new PasseioCorSpecification(Color.RED);

		Passeio car = new Passeio();
		car.setColor(Color.RED);
		assertTrue(spec.isSatisfiedBy(car));

		car.setColor(Color.GREEN);
		assertFalse(spec.isSatisfiedBy(car));
			
		PasseioConversivelSpecification spec2 = new PasseioConversivelSpecification();
		car.setConversivel(true);
		assertTrue(spec2.isSatisfiedBy(car));
	}

	@Test
	public void testeEspeficacoes(){
		
            //cria as especificacoes
		    final Specification<Passeio> colorRed = new PasseioCorSpecification(Color.RED);
		    final Specification<Passeio> convertible = new PasseioConversivelSpecification();
		    
		    //candidato as especificacoes 
		    Passeio passeio = new Passeio();
		    passeio.setColor(Color.RED);
		    passeio.setConversivel(true);
		    
		    //testa o candidato
		    Specification<Passeio> candidateCarSpecification =
				       colorRed.and( convertible );

		    assertTrue( candidateCarSpecification.isSatisfiedBy(passeio) );
		
	}
	
}
