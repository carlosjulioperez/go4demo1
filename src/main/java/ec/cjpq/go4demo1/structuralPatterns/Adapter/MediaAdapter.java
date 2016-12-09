package ec.cjpq.go4demo1.structuralPatterns.Adapter;

/**
 * Gang of Four Design Patterns Demo 1
 * MediaAdapter class implementing the MediaPlayer interface
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType){
		if ( audioType.equalsIgnoreCase("vlc") ){
			advancedMusicPlayer = new VlcPlayer();
		} else if ( audioType.equalsIgnoreCase("mp4") ){
			advancedMusicPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName){
		if ( audioType.equalsIgnoreCase("vlc") ){
			advancedMusicPlayer.playVlc(fileName);
		} else if ( audioType.equalsIgnoreCase("mp4") ){
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
