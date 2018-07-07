package com.jvs.libgdx.test2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class MainMenuScreen extends ScreenAdapter {

    final Drop2 game;
    OrthographicCamera camera;

    public MainMenuScreen(final Drop2 game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, Drop2.GAME_WIDTH, Drop2.GAME_HEIGHT);
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Welcome to Drop2!!! ", 100, 150);
        game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            // if the screen has been touched, then set the games screen to a GameScreen instance
            game.setScreen(new GameScreen(game));
            // dispose of the current instance (MainMenuScreen)
            dispose();
        }
    }

    @Override
    public void hide() {
        // NOTE: screens don't dispose automatically
        dispose();
    }

    @Override
    public void dispose() {
        // Nothing to dispose in this screen
    }
}
