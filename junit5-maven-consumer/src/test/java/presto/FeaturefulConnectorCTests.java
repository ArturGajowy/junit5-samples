package presto;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.contracts.MoreFeaturefulConnectorTests;

import java.io.IOException;

public class FeaturefulConnectorCTests
        implements MoreFeaturefulConnectorTests
{
    private ConnectorC connector;

    @BeforeAll
    public void beforeAllTests()
    {
        System.out.println(getClass().getSimpleName() + ".beforeAllTests()");
        connector = new ConnectorC();
    }

    @AfterAll
    public void afterAllTests()
            throws IOException
    {
        System.out.println(getClass().getSimpleName() + ".afterAllTests()");
        connector.close();
    }

    @Override
    public ConnectorC getConnector()
    {
        return connector;
    }

    @Test
    void testSpecificsOfConnectorC(TestInfo testInfo)
    {
        Util.output(testInfo);
    }

    @Override /* This test won't be included in the test report */
    public void testBasicWrite(TestInfo testInfo)
    {
    }

    @Override
    @Test
    @Disabled /* This test will be included in the test report as disabled (ignored) */
    public void testAdvancedRead(TestInfo testInfo)
    {

    }
}
