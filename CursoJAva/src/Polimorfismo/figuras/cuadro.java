package Polimorfismo.figuras;

public class cuadro extends Figura{
	
	private double lado;
	
	public cuadro(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	
	
	
}
