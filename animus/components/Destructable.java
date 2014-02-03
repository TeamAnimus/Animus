package animus.components;

import com.artemis.Component;

public class Destructable extends Component
{
    private int hitPoints;
    private int maxHitPoints;

    public Destructable ( int initMaxHitPoints )
    {
        maxHitPoints = initMaxHitPoints;
    }
    public Destructable ( int initMaxHitPoints, int initHitPoints )
    {
        maxHitPoints = initMaxHitPoints;
        hitPoints = initHitPoints;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }
    public int getMaxHitPoints()
    {
        return maxHitPoints;
    }

    public float getHitPointPercent()
    {
        return ( ( float ) hitPoints / maxHitPoints ) * 100;
    }

    public boolean isDestroyed()
    {
        return ( hitPoints < 0 );
    }

    public void heal ( int health )
    {
        hitPoints += health;
    }
    public void damage ( int damage )
    {
        hitPoints -= damage;
    }
}
