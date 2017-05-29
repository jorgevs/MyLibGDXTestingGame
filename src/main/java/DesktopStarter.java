import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopStarter {

    public static void main(String[] argv) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "my-test-gdx-game";
        config.useGL30 = true;
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new MyGame(), config);
    }
}