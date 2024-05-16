package encapsulamiento;

class Examen {
	float calificacion;
	float noPreguntas;
	boolean activo;
	
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	public float getCalificacion() {
		return calificacion;
	}
	
	public void setNoPreguntas(float noPreguntas) {
		this.noPreguntas = noPreguntas;
	}
	
	public float getNoPreguntas() {
		return noPreguntas;
	}
	
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public boolean isActivo() {
		return activo;
	}
	
}


public class PruebaExamen {

	public static void main(String[] args) {
		Examen e = new Examen();
		e.setCalificacion(45.32f);

	}

}
