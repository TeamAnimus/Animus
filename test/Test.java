package test;

import com.artemis.Entity;
import com.artemis.EntitySystem;
import com.artemis.World;
import com.artemis.ComponentMapper;

import test.components.*;
import test.systems.*;

public class Test
{
    private World world;
    private ComponentMapper<TestComponent> numMapper;
    
    public Test()
    {
        world = new World();

        world.setSystem ( new OutputSystem ( 5000000 ) );
        //world.setSystem ( new TestSystem() );

        world.initialize();

        numMapper = world.getMapper( TestComponent.class );

        createEntity ( 3 );
        createEntity ( 5 );
        createEntity ( 99 );
        createOtherEntity ( 12345 );

        world.setDelta ( 1 );

        while ( true )
        {
            world.process();
        }
    }

    private Entity createEntity ( int num )
    {
        Entity e = world.createEntity();

        e.addComponent ( new TestComponent ( num ) );
        e.addComponent ( new OtherComponent ( num ) );
        world.addEntity ( e );

        return e;
    }

    private Entity createOtherEntity ( int num )
    {
        Entity e = world.createEntity();

        e.addComponent ( new OtherComponent ( num ) );
        world.addEntity ( e );

        return e;
    }

    public static void main ( String args[] )
    {
        new Test();
    }
}
