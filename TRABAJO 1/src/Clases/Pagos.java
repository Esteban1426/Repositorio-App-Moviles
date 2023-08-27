package Clases;

public class Pagos extends Formato
{
	
	public Pagos(String Nombre ,String Carrera, String Sede,int Edad,int Semestre, int Estrato
						,String valorSemestre, String FechaPago, String MetodoPago)
	{
		super(Nombre, Carrera, Sede, Semestre, Edad, Estrato);
		this.setValorSemestre(valorSemestre);
		this.setFechaPago(FechaPago);
		this.setMetodoPago(MetodoPago);
	}
}	