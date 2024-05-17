package Polimorfismo.figuras;

public class PruebaDibujable {
	
	void probarDibujar(Dibujable dibujale) {
		dibujale.dibujar();
	}
	
	public static void main(String[] args) {
		PruebaDibujable p = new PruebaDibujable();
		p.probarDibujar(new Circulo("Verde", 15));
		p.probarDibujar(new Rectangulo("Rojo", 11.23f, 15.3f));
		p.probarDibujar(new Imagen());
		
		System.out.println(new Circulo("Rosa", 25.3f) instanceof Dibujable);

	}

}
