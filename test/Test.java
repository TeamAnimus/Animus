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

        EntityFactory.createTestEntity ( world, 3 );
        Entity e = EntityFactory.createTestEntity ( world, 5 );
        e.disable();
        EntityFactory.createTestEntity ( world, 99 );
        EntityFactory.createOtherEntity ( world, 12345 );

        world.setDelta ( 1 );

        while ( true )
        {
            world.process();
        }
    }

    public static void main ( String args[] )
    {
        new Test();
    }
}
