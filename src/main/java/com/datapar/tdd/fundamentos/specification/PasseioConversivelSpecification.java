package com.datapar.tdd.fundamentos.specification;

import com.datapar.tdd.fundamentos.model.Passeio;
import com.datapar.tdd.fundamentos.specification.generics.AbstractSpecification;

public class PasseioConversivelSpecification extends AbstractSpecification<Passeio> {
 
	@Override
	public boolean isSatisfiedBy(Passeio passeio) {
		return passeio.isConversivel();
	}
}
