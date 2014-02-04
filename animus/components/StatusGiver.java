package animus.components;

import com.artemis.Component;

public class StatusGiver extends Component
{
    private int status;

    public StatusGiver ( int initStatus )
    {
        status = initStatus;
    }

    public void setStatus ( int newStatus )
    {
        status = newStatus;
    }

    public int getStatus()
    {
        return status;
    }
}
