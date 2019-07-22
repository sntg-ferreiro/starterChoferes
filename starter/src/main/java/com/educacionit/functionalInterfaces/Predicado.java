package com.educacionit.functionalInterfaces;

import edu.educacionit.model.Chofer;

@FunctionalInterface
public interface Predicado {
	boolean filtrar(Chofer c);
}
