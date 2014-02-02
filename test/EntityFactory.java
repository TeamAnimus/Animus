package test;

import com.artemis.Entity;
import com.artemis.World;
import com.artemis.managers.GroupManager;
import test.components.TestComponent;

public class EntityFactory
{
    public static Entity createTestEntity ( World world, int num )
    {
        Entity e = world.createEntity();

        e.addComponent ( new TestComponent ( num ) );

        world.getManager ( GroupManager.class ).add ( e, "TEST" );

        return e;
    }
}
