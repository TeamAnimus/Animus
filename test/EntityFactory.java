package test;

import com.artemis.Entity;
import com.artemis.World;
import com.artemis.managers.GroupManager;
import test.components.TestComponent;
import test.components.OtherComponent;

public class EntityFactory
{
    public static Entity createTestEntity ( World world, int num )
    {
        Entity e = world.createEntity();

        e.addComponent ( new TestComponent ( num ) );
        e.addComponent ( new OtherComponent ( num ) );

        world.addEntity ( e );

        return e;
    }

    public static Entity createOtherEntity ( World world, int num )
    {
        Entity e = world.createEntity();

        e.addComponent ( new OtherComponent ( num ) );
        world.addEntity ( e );

        return e;
    }
}
