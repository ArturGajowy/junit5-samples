package presto.contracts.feature;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.Util;
import presto.contracts.SampleConventionContract;
import presto.contracts.base.ConnectorTests;

public interface AdvancedReadTests
        extends ConnectorTests, SampleConventionContract
{
    @Test
    default void testAdvancedRead(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
