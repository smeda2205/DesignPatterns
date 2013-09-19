package com.learn.designpatterns.adapterpattern;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		//inbuild support to play mp3 music files
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing MP3 file. Name: " + fileName);
		}
		
		//mediaAdapter is providing support to play other file formats
		else if(audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid Media. " + audioType + " format not supported");
		}
	}

}
