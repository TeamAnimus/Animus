package gdxtest;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Desktop
{
    public static void main ( String args[] )
    {
        new LwjglApplication ( new Animus(), "Animus", 480, 320, false );
    }
}
