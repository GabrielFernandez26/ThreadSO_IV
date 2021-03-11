package controller;

import view.Principal;

public class CorridaDeSapo extends Thread{
	
	private int distCorrida;
	private int distSalto;
	
	public CorridaDeSapo(int distCorrida, int distSalto) {
		this.distCorrida = distCorrida;
		this.distSalto = distSalto;
	}

	@Override
	public void run() {
		corrida();
	}

	private void corrida() {
		int salto;
		int distMax = 0;
		do {
			salto = (int) (Math.random() * distSalto + 1);
			distMax += salto;
			System.out.println("Sapo " +getId()+" pulou "+salto+"m. Ele percorreu, com saltos: "+ distMax + "m");
		}while(distMax < distCorrida);
		System.out.println("Sapo "+getId()+" ficou na colocação de "+(++Principal.podium)+"°");
	}
	
	
}
