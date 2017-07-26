package presto;

import java.io.Closeable;
import java.io.IOException;

public abstract class Connector
        implements Closeable
{
    public Connector()
    {
        System.out.println("! Creating connector " + getClass().getSimpleName());
    }

    @Override
    public void close()
            throws IOException
    {
        System.out.println("! Closing connector " + getClass().getSimpleName() + "\n");
    }
}
