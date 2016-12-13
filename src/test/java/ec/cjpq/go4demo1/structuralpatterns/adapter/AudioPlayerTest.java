package ec.cjpq.go4demo1.structuralpatterns.adapter;

import junit.framework.TestCase;

/**
 * Gang of Four Design Patterns Demo 1
 * AudioPlayer test class to play different types of audio formats. This class demonstrate singleton Pattern.
 * @author carper, carlosjulioperez@gmail.com
 * 2016-12-08
 */
public class AudioPlayerTest extends TestCase{

	public void test(){
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
