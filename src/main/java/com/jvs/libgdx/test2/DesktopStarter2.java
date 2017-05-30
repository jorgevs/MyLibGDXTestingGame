package com.jvs.libgdx.test2;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jvs.libgdx.test1.Drop;

public class DesktopStarter2 {
    public static void main(String[] argv) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "my-test2-gdx-game";
        config.useGL30 = true;
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new Drop2(), config);
    }
}
