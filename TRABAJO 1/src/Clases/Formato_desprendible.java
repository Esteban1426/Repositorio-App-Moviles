package Clases;

public class Formato_desprendible 
{
	
	int NumeroReferencia;
	String Banco, Remitente, Fecha, Mensajero;
	
	public Formato_desprendible(int numeroReferencia, String banco, String remitente) 
	{
		this.NumeroReferencia = numeroReferencia;
		this.Banco = banco;
		this.Remitente = remitente;	
	}

	public Formato_desprendible(String fecha,String Mensajero) 
	{
		this.Fecha = fecha;
		this.Mensajero = Mensajero;
	}
	
	public static void mostrarDatos() 
	{
		
		Formato datos = new Pagos("Esteban" ,"Desarrollo Software" , "Tagaste",4,20, 2, "$ 2.300.000", "15/06/2023", "Tarjeta Credito");
		Formato_desprendible comprobante = new Formato_desprendible(13425-7, "BANCO BANCOLOMBIA", "Universidad Unigustiniana");
		Formato_desprendible info = new Formato_desprendible("20/07/2023", "Ana Maria Carvajal - Secretaria ");
		
		System.out.println("------------------------------ \n");
		System.out.println("***********DATOS************ \n");
		System.out.println("------------------------------ \n");
		System.out.println("*********ESTUDIANTE********** \n");
		System.out.println("Nombre: "+ datos.getNombre() + "\n"
							+"Carrera: "+ datos.getCarrera() + "\n"
							+"Edad: "+ datos.getEdad() + "\n"
							+"Semestre: "+ datos.getSemestre() + "\n"
							+"Sede: "+ datos.getSede() + "\n"
							+"Estrato: "+ datos.getEstrato() + "\n");
		System.out.println("------------------------------ \n");
		System.out.println("*********PAGO********** \n");
		System.out.println("Precio: "+ datos.getValorSemestre() + "\n"
							+"Fecha de Pronto Pago: "+ datos.getFechaPago() + "\n"
							+"Pago con: "+ datos.getMetodoPago() + "\n");
		System.out.println("------------------------------ \n");
		System.out.println("*********COMPROBANTE********** \n");
		System.out.println("N.Referencia: "+ comprobante.NumeroReferencia + "\n"
							+"Banco: "+ comprobante.Banco + "\n"
							+"Remitente: "+ comprobante.Remitente + "\n"
							+"Fecha Ingreso Monetario: "+ info.Fecha + "\n"
							+"Enviado Por: "+ info.Mensajero + "\n");
		System.out.println("------------------------------ \n");

	}
}
