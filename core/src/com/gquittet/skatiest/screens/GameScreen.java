package com.gquittet.skatiest.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.gquittet.skatiest.assets.AssetsLoader;
import com.gquittet.skatiest.helpers.InputHandler;
import com.gquittet.skatiest.logs.Log;
import com.gquittet.skatiest.renderer.Renderer;

/**
 * Created by Guillaume QUITTET on 29-09-16.
 */
public class GameScreen implements Screen {

    private GameWorld gameWorld;
    private Renderer renderer;

    public GameScreen() {
        gameWorld = new GameWorld();
        renderer = new Renderer(gameWorld);
        Gdx.input.setInputProcessor(new InputHandler());
    }

    @Override
    public void show() {
        Log.info("show called");
    }

    @Override
    public void render(float delta) {
        Log.info("render called");
        gameWorld.update(delta);
        renderer.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        Log.info("resize called");
    }

    @Override
    public void pause() {
        Log.info("pause called");
    }

    @Override
    public void resume() {
        Log.info("resume called");
    }

    @Override
    public void hide() {
        Log.info("hide called");
    }

    @Override
    public void dispose() {
        Log.info("dispose called");
        AssetsLoader.dispose();
    }
}
