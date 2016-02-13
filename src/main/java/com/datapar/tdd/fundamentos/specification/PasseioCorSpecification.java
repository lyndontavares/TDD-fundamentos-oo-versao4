package com.datapar.tdd.fundamentos.specification;

import java.awt.Color;

import com.datapar.tdd.fundamentos.model.Passeio;
import com.datapar.tdd.fundamentos.specification.generics.AbstractSpecification;

public class PasseioCorSpecification  extends AbstractSpecification<Passeio> {

	  private Color color;

	  public PasseioCorSpecification(Color color) {
	    this.color = color;
	  }

	  public boolean isSatisfiedBy(final Passeio car) {
	    return car.getColor() == color;
	  }
	
}
