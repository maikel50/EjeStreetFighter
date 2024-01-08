package modelo;



public class J2Seleccionado {
	private String nombre;
	public J2Seleccionado(String nombre) {
		this.nombre=nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "J1Seleccionado [nombre=" + nombre + "]";
	}
}
