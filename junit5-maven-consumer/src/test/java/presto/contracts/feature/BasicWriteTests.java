package presto.contracts.feature;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.Util;
import presto.contracts.base.ConnectorTests;

public interface BasicWriteTests
        extends ConnectorTests
{
    @Test
    default void testBasicWrite(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
