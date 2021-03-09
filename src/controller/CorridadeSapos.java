package controller;
import java.util.Random;

public class CorridadeSapos extends Thread {
		
    int pulos;
	int sapo;
		
	
   public CorridadeSapos(int sapo) {	
	  this.sapo = sapo;	
	  
   }
		
	@Override
	public void run() {
		iniciarcorrida();
	}
		
		
    public void iniciarcorrida() {
    	Random aleatorio = new Random(); 	 
		while(pulos < 15) {
		  pulos += aleatorio.nextInt(15);
		  System.out.println("O Sapo " + sapo + " pulou " + pulos + "m");
		  if(pulos >= 15) {
			System.out.println();
		    System.out.println("O Sapo: " + sapo + "  Chegou ao Final!");
		    System.out.println();
		   
		    }	  
	   }
     }	
	 
		
		
		  
}	
	
		

