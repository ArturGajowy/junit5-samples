package presto;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.contracts.SimplestPossibleConnectorTests;

import java.io.IOException;

public class SimpleConnectorATests
        implements SimplestPossibleConnectorTests
{
    private ConnectorA connector;

    @BeforeAll
    public void beforeAllTests()
    {
        System.out.println(getClass().getSimpleName() + ".beforeAllTests()");
        connector = new ConnectorA();
    }

    @AfterAll
    public void afterAllTests()
            throws IOException
    {
        System.out.println(getClass().getSimpleName() + ".afterAllTests()");
        connector.close();
    }

    @Override
    public ConnectorA getConnector()
    {
        return connector;
    }

    @Test
    void testSpecificsOfConnectorA(TestInfo testInfo)
    {
        Util.output(testInfo);
    }

    @Test
    void testSpecificsOfConnectorA2(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
