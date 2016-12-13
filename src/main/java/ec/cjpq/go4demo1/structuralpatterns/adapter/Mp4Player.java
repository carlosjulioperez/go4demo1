package ec.cjpq.go4demo1.structuralpatterns.adapter;

/**
 * Gang of Four Design Patterns Demo 1
 * Mp4Player concrete class implementing AdvancedMediaPlayer interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName){
		//Do nothing...	
	}
	
	@Override
	public void playMp4(String fileName){
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
