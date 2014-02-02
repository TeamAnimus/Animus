package test.components;

import com.artemis.Component;

public class TestComponent extends Component
{
    private int num;

    public TestComponent ( int initNum )
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
