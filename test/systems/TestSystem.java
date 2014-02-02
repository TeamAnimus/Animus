package test.systems;

import com.artemis.Aspect;
import com.artemis.systems.VoidEntitySystem;

public class TestSystem extends VoidEntitySystem
{
    public TestSystem()
    {
        super();
    }

    @Override
    protected void processSystem()
    {
        System.out.println ( "Test works." );
    }
}
