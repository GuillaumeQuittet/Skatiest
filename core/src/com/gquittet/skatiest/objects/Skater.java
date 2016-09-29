package com.gquittet.skatiest.objects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Guillaume QUITTET on 29-09-16.
 */
public class Skater extends Object {

    private boolean sens;

    public Skater(int width, int height, Vector2 position, boolean sens) {
        super(width, height, position);
        this.sens = sens;
    }
}
