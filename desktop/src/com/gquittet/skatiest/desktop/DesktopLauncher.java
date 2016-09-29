package com.gquittet.skatiest.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gquittet.skatiest.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 360;
        config.height = 640;
        config.resizable = false;
		new LwjglApplication(new Main(), config);
	}
}
