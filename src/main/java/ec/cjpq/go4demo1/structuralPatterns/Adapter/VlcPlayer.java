package ec.cjpq.go4demo1.structuralPatterns.Adapter;

/**
 * Gang of Four Design Patterns Demo 1
 * VlcPlayer concrete class implementing AdvancedMediaPlayer interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName){
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName){
		//Do nothing...	
	}
	
}
