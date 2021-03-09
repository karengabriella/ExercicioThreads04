package view;

import controller.CorridadeSapos;

public class Principal {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
	     	  Thread corridadesapo = new CorridadeSapos(i);
			  corridadesapo.start();		
	    }
		
		
	}

}
