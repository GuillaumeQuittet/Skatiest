package com.gquittet.skatiest.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;
import java.util.List;

import static com.badlogic.gdx.graphics.Texture.*;

/**
 * Created by Guillaume QUITTET on 29-09-16.
 */
public class AssetsLoader {

    public static Texture texture;
    public static TextureRegion background;
    public static TextureRegion cloud;


    /**
     * Load all the resources.
     */
    public static void load() {
        texture = new Texture(Gdx.files.internal("graphics/textures.png"));
        texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

        background = new TextureRegion(texture, 1, 67, 360, 640);
        background.flip(false, true);

        cloud = new TextureRegion(texture, 1, 1, 104, 64);
        cloud.flip(false, true);
    }

    /**
     * Dispose all the resources.
     */
    public static void dispose() {
        texture.dispose();
    }
}
