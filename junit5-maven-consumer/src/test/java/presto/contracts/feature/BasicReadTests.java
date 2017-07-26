package presto.contracts.feature;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.Util;
import presto.contracts.base.ConnectorTests;

public interface BasicReadTests
        extends ConnectorTests
{
    @Test
    default void testBasicRead(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
