package modificadores.paquete2;

import modificadores.paquete1.EjemploProtected;

public class PuebaEjemploProtected extends EjemploProtected{
	void bar() {
		foo();
	}
	public static void main(String[] args) {
		PuebaEjemploProtected e = new PuebaEjemploProtected();
		e.bar();

	}

}
