package test.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.systems.IntervalEntityProcessingSystem;
import com.artemis.utils.ImmutableBag;

import test.components.TestComponent;

public class OutputSystem extends IntervalEntityProcessingSystem
{
    private ComponentMapper<TestComponent> numMapper;

    public OutputSystem ( int interval )
    {
        super ( Aspect.getAspectForOne ( TestComponent.class ), interval );
        System.out.println ( "Creating new OutputSystem." );
    }

    @Override
    protected void initialize()
    {
        numMapper = world.getMapper ( TestComponent.class );
    }

    @Override
    protected void process ( Entity e )
    {
        TestComponent t = numMapper.get ( e );

        System.out.println ( e + ":" + t.getNum() + "++" );

        t.setNum ( t.getNum() + 1 );
    }

    @Override
    protected void end()
    {
        System.out.println ();
    }
}
