package slicktest;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class SlickTest extends BasicGame
{
    private TiledMap testMap;

    public SlickTest()
    {
        super ( "Slick Test" );
    }

    @Override
    public void init ( GameContainer container ) throws SlickException
    {
        testMap = new TiledMap ( "data/TestMap.tmx" );
    }

    @Override
    public void update ( GameContainer container, int delta ) throws SlickException
    {
        // Do nothing
    }

    @Override
    public void render ( GameContainer container, Graphics g ) throws SlickException
    {
        testMap.render ( 0, 0 );
    }

    public static void main ( String args[] ) throws SlickException
    {
        SlickTest game = new SlickTest();
        AppGameContainer container = new AppGameContainer ( game );
        container.setDisplayMode ( 1024, 768, false );
        container.setAlwaysRender ( true );
        container.start();
    }
}
