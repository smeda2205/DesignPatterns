package com.learn.designpatterns.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC file. Name : " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// Do Nothing
	}

}
