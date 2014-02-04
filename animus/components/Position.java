package animus.components;

import com.artemis.Component;
import com.artemis.utils.Utils;

public class Position extends Component
{
    private float x;
    private float y;

    public Position()
    {
        x = 0;
        y = 0;
    }

    public Position ( float initX, float initY )
    {
        x = initX;
        y = initY;
    }

    public void addX ( float incX )
    {
        x += incX;
    }
    public void addY ( float incY )
    {
        y += incY;
    }

    public void setX ( float newX )
    {
        x = newX;
    }
    public void setY ( float newY )
    {
        y = newY;
    }

    public void setPosition ( float newX, float newY )
    {
        x = newX;
        y = newY;
    }

    public float getX()
    {
        return x;
    }
    public float getY()
    {
        return y;
    }

    public float distanceTo ( float to_x, float to_y )
    {
        return Utils.distance ( to_x, to_y, x, y );
    }
    public float distanceTo ( Position p )
    {
        return Utils.distance ( p.getX(), p.getY(), x, y );
    }
}
