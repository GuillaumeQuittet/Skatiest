package com.gquittet.skatiest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gquittet.skatiest.assets.AssetsLoader;
import com.gquittet.skatiest.logs.Log;
import com.gquittet.skatiest.screens.GameScreen;

public class Main extends Game {

	@Override
	public void create() {
		Log.info("Game created");
        AssetsLoader.load();
        setScreen(new GameScreen());
	}
}
