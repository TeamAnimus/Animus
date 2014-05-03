package animus;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.Gdx;

public class GameScreen implements Screen
{
    public GameScreen ( Game game )
    {
        // Do nothing
    }

    @Override
    public void render ( float delta )
    {
        Gdx.gl10.glClear ( GL10.GL_COLOR_BUFFER_BIT );
    }

    @Override
    public void pause()
    {
        // Do nothing
    }

    @Override
    public void resize ( int width, int height )
    {
        // Do nothing
    }

    @Override
    public void resume()
    {
        // Do nothing
    }

    @Override
    public void show()
    {
        // Do nothing
    }

    @Override
    public void hide()
    {
        // Do nothing
    }

    @Override
    public void dispose()
    {
        // Do nothing
    }
}
