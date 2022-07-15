package ex05;

public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected Sexo sexo;
	protected boolean presente;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = null;
	}
	
	public Persona(String nombre,int edad,Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public abstract boolean asistencia();
	
}
