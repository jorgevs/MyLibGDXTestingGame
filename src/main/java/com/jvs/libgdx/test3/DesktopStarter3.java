package com.jvs.libgdx.test3;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopStarter3 {
    public static void main(String[] argv) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "my-test3-gdx-game";
        config.useGL30 = false;
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new Scene2DImages(), config);
    }
}
