package com.jvs.libgdx.test2;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Drop2 extends Game {

    static int GAME_WIDTH = 800;
    static int GAME_HEIGHT = 480;

    public SpriteBatch batch;
    public BitmapFont font;

    public void create() {
        batch = new SpriteBatch();

        //Use LibGDX's default Arial font.
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));
    }

    public void render() {
        super.render(); // Important!
    }

    public void dispose() {
        // dispose the actual com.mygdx.obstacleavoid.screen object
        getScreen().dispose(); // Important!

        batch.dispose();
        font.dispose();
    }
}
