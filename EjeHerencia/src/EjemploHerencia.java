class Animal {
	String nombre;
	public void respirar() {
		System.out.println("Soy un animal  y puedo respirar");
	}
}

class Perro extends Animal{
	
}

class Gato extends Animal{
	
}

public class EjemploHerencia {

	public static void main(String[] args) {
		Perro p=new Perro();
		p.nombre = "Max";
		p.respirar();
		Gato g = new Gato();
		g.nombre="CAT";
		g.respirar();
	}

}
