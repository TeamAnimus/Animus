package animus;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.Game;

public class Animus extends Game
{
    public static final int FRAME_WIDTH = 1280;
    public static final int FRAME_HEIGHT = 900;

    @Override
    public void create()
    {
        setScreen ( new GameScreen ( this ) );
    }

    public static void main ( String args[] )
    {
        LwjglApplicationConfiguration config =
            new LwjglApplicationConfiguration();
        config.fullscreen = false;
        config.width = FRAME_WIDTH;
        config.height = FRAME_HEIGHT;
        config.vSyncEnabled = false;
        config.title = "Animus";
        new LwjglApplication ( new Animus(), config );
    }
}
