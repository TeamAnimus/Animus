package animus.components;

import com.artemis.Component;

public class Damager extends Component
{
    private int damage;

    public Damager ( int initDamage )
    {
        damage = initDamage;
    }

    public int getDamage()
    {
        return damage;
    }
    
    public void setDamage ( int newDamage )
    {
        damage = newDamage;
    }
}
