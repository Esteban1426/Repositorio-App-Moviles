package Clases;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;

public class Actividad_1 extends Thread
{
	private Clip clip;

	@Override
	public void run()
	{
		
	}
		
	public void Cancion (String rutaCancion)
	{
		try 
		{
			
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(rutaCancion));
			
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			clip.start();
				
		}
			
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void AcabarCancion() 
	{
		if(clip != null && clip.isRunning())
		{
			clip.stop();
			clip.close();
		}
	}
}
