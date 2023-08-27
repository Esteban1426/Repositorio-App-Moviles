package Clases;

public class Clase_Main 
{
	public static void main(String[] args) 
	{
		Actividad_1 Musica = new Actividad_1();
		Actividad_2 Datos_cancion = new Actividad_2();
		
		Musica.Cancion("Song.wav");
		Musica.start();
		System.out.println("<<<<<<<REPRODUCIENDO CANCION>>>>>> \n");
		Datos_cancion.start();
		
		
		try{
            Thread.sleep(70000);
            Musica.AcabarCancion();
        } 
		catch(InterruptedException e)
		{
            e.printStackTrace();
		}
	}
}
