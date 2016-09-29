package com.gquittet.skatiest.renderer;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.gquittet.skatiest.assets.AssetsLoader;
import com.gquittet.skatiest.logs.Log;
import com.gquittet.skatiest.screens.GameWorld;

import static com.badlogic.gdx.Gdx.gl;

/**
 * Created by Guillaume QUITTET on 29-09-16.
 */
public class Renderer {


    // The world of the game.
    private GameWorld gameWorld;

    // The camera
    private OrthographicCamera cam;

    // The tools that they draw what I want.
    private ShapeRenderer shapeRenderer;
    private SpriteBatch spriteBatch;

    // The textures.
    private TextureRegion background;
    private TextureRegion cloud;

    // The objects.

    public Renderer(GameWorld gameWorld) {
        this.gameWorld = gameWorld;
        initCamera();
        initDrawingTools();
        initGameObjects();
        initTextures();
    }

    /**
     * Initialize the camera.
     */
    private void initCamera() {
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 180, 320);
    }

    /**
     * Initialize the drawing tools.
     */
    private void initDrawingTools() {
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        spriteBatch = new SpriteBatch();
        spriteBatch.setProjectionMatrix(cam.combined);
    }

    /**
     * Initialize the objects of the game.
     */
    private void initGameObjects() {

    }

    /**
     * Initialize the textures of the game.
     */
    private void initTextures() {
        background = AssetsLoader.background;
        cloud = AssetsLoader.cloud;
    }

    public void render(float delta) {
        Log.info("render");
        gl.glClearColor(0, 0, 0, 1);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        drawBackground();
        drawClouds();
    }

    private void drawBackground() {
        spriteBatch.begin();
        spriteBatch.disableBlending();
        spriteBatch.draw(background, 0, 0, 180, 320);
        spriteBatch.end();
    }

    private void drawClouds() {
        spriteBatch.begin();
        spriteBatch.enableBlending();
        spriteBatch.draw(cloud, 0, 0, 52, 32);
        spriteBatch.disableBlending();
        spriteBatch.end();
    }
}
