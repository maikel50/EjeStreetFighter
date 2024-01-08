package modelo;

public class Jugador {
	private String nombre;
	private String nacionalidad,descripcion;
	private int edad,potencia,velocidad,peso,fisico;
	private double estatura;
	public Jugador(String nombre,String nacionalidad,int edad, double estatura,int peso,int potencia,int velocidad,int fisico,String descripcion) {
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
		this.edad=edad;
		this.estatura=estatura;
		this.peso=peso;
		this.potencia=potencia;
		this.velocidad=velocidad;
		this.fisico=fisico;
		this.descripcion=descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", descripcion=" + descripcion
				+ ", edad=" + edad + ", potencia=" + potencia + ", velocidad=" + velocidad + ", peso=" + peso
				+ ", fisico=" + fisico + ", estatura=" + estatura + "]";
	}
	public int restarVida(int daño,int vida) {
		vida = vida - daño;
		return vida;
	}
	public int restarDescanso(int daño,int descanso) {
		descanso = descanso - daño;
		return descanso;
	}
	public int restarCansancio(int velocidad,int descanso) {
		descanso = descanso-velocidad;
		return descanso;
	}
	public int sumarDescanso(int fisico,int descanso) {
		descanso = descanso + fisico;
		return descanso;
	}
}
