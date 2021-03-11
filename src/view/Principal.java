package view;

import controller.CorridaDeSapo;

public class Principal {
	public static int podium = 0;
	public static void main(String[] args) {
		int distCorrida;
		int distSalto;
		
		for (int i = 0; i < 5; i++) {
			Thread t = new CorridaDeSapo(15, 5);
			t.start();
		}
	}

}
