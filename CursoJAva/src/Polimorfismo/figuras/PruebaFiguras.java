package Polimorfismo.figuras;

public class PruebaFiguras {

	void imprimirArea(Figura figura) {
		System.out.println("El color de la figura es  " + figura.getColor()+" y tiene un area de "+ figura.calcularArea());
	}
	
	public static void main(String[] args) {
		PruebaFiguras p = new PruebaFiguras();
		
		p.imprimirArea(new Circulo("Rojo", 45));
		p.imprimirArea(new cuadro("Verde", 65.23f));
		p.imprimirArea(new Rectangulo("Rosa", 78, 10));

	}

}
