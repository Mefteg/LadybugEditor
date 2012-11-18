package com.ladybug.editor;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "LadybugEditor";
		cfg.useGL20 = false;
		cfg.width = (int) Global.WINDOW_WIDTH;
		cfg.height = (int) Global.WINDOW_HEIGHT;
		
		new LwjglApplication(new Editor(), cfg);
	}
}
