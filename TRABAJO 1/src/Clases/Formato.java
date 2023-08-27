package Clases;

public class Formato 
{
	private String Nombre, Carrera, Sede;
	private int Semestre, Estrato, Edad;
	private String valorSemestre;
	private String FechaPago;
	private String MetodoPago;
	
	public Formato(String Nombre ,String Carrera, String Sede,int Edad,int Semestre, int Estrato)
	{
		this.Nombre = Nombre;
		this.Carrera = Carrera;
		this.Semestre = Semestre;
		this.Sede = Sede;
		this.Edad = Edad;
		this.Estrato = Estrato;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		this.Carrera = carrera;
	}

	public String getSede() {
		return Sede;
	}

	public void setSede(String sede) {
		this.Sede = sede;
	}

	public int getSemestre() {
		return Semestre;
	}

	public void setSemestre(int semestre) {
		this.Semestre = semestre;
	}

	public int getEstrato() {
		return Estrato;
	}

	public void setEstrato(int estrato) {
		this.Estrato = estrato;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		this.Edad = edad;
	}

	public String getValorSemestre() {
		return valorSemestre;
	}

	public void setValorSemestre(String valorSemestre) {
		this.valorSemestre = valorSemestre;
	}

	public String getFechaPago() {
		return FechaPago;
	}

	public void setFechaPago(String fechaPago) {
		this.FechaPago = fechaPago;
	}

	public String getMetodoPago() {
		return MetodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.MetodoPago = metodoPago;
	}
		
}
