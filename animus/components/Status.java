package animus.components;

import com.artemis.Component;

public class Status extends Component
{
    public int status;
    public int timeout;

    public Status ( int initStatus, int initTimeout )
    {
        status = initStatus;
        timeout = initTimeout;
    }

    public void setStatus ( int newStatus )
    {
        status = newStatus;
    }
    
    public int getStatus()
    {
        return status;
    }

    public void decTime()
    {
        --timeout;
    }

    public int getTimeout()
    {
        return timeout;
    }

    public boolean expired()
    {
        return ( timeout <= 0 );
    }
}
