package com.jvs.libgdx.test5;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jvs.libgdx.test3.Scene2DImages;

public class DesktopStarter5 {
    public static void main(String[] argv) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "my-test3-gdx-game";
        config.useGL30 = false;
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new Scene2DButtons(), config);
    }
}
