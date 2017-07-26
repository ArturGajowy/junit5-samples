package presto.contracts.feature;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.Util;

public interface DataOnlyTests
        extends BasicReadTests, BasicWriteTests
{
    @Test
    default void testAdditionalDataOnlyProperties(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
