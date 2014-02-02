package test.components;

import com.artemis.Component;

public class OtherComponent extends Component
{
    private int num;

    public OtherComponent ( int initNum )
    {
        num = initNum;
    }

    public int getNum()
    {
        return num;
    }
    
    public void setNum ( int newNum )
    {
        num = newNum;
    }
}
