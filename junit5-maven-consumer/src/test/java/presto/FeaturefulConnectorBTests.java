package presto;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import presto.contracts.MoreFeaturefulConnectorTests;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FeaturefulConnectorBTests
        implements MoreFeaturefulConnectorTests
{
    private Connector connector;

    @BeforeAll
    public void beforeAllTests()
    {
        System.out.println(getClass().getSimpleName() + ".beforeAllTests()");
        connector = new ConnectorB();
    }

    @AfterAll
    public void afterAllTests()
            throws IOException
    {
        System.out.println(getClass().getSimpleName() + ".afterAllTests()");
        connector.close();
    }

    @Override
    public Connector getConnector()
    {
        return connector;
    }

    @Test
    void testSpecificsOfConnectorB(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
