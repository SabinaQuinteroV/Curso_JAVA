
public class Persona {
	
	String tipo;
	String nombre;
	int edad;
	String color;
	
	Persona() {
		
	}
	
	Persona(String  t, String n, int e, String c) {
		tipo = t;
		nombre = n;
		edad = e;
		color = c;
	}
	
	void Imprimir() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Color: " + color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona perro = new Persona("Perro","MAx",5,"Negro");
		perro.Imprimir();
		
	}

}
