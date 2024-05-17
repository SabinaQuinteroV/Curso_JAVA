package Polimorfismo.figuras;

public class Rectangulo extends Figura implements Dibujable{
	private double base;
	private double altura;
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public void dibujar() {
		System.out.println("Dibujando un Rectangulo");
		
	}
	
	
	
}
