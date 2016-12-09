package ec.cjpq.go4demo1.structuralPatterns.Adapter;

/**
 * Gang of Four Design Patterns Demo 1
 * AudioPlayer concrete class implementing the MediaPlayer interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName){
		
		//Inbuilt support to play mp3 music files
		if ( audioType.equalsIgnoreCase("mp3") ){
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		//mediaAdapter is provinding support to play other file formats.
		else if ( audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4") ){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else{
			System.out.println("Invalid media. " + audioType + " format not supported.");
		}
	}
}
