package animus.components;

import com.artemis.Component;

public class Stamina extends Component
{
    private int stamina;
    private int maxStamina;

    public Stamina ( int initStamina )
    {
        maxStamina = initStamina;
    }
    public Stamina ( int initMaxStamina, int initStamina )
    {
        maxStamina = initMaxStamina;
        stamina = initStamina;
    }

    public int getStamina()
    {
        return stamina;
    }
    public int getMaxStamina()
    {
        return maxStamina;
    }

    public float getHitPointPercent()
    {
        return ( ( float ) stamina / maxStamina ) * 100;
    }

    public boolean isDestroyed()
    {
        return ( stamina < 0 );
    }

    public void increase ( int amount )
    {
        stamina += amount;
    }
    public void decrease ( int amount )
    {
        stamina -= amount;
    }
}
