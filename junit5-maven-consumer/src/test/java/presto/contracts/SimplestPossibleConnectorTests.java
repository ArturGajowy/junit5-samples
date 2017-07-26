package presto.contracts;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import presto.Util;
import presto.contracts.feature.DataOnlyTests;
import presto.contracts.feature.PokeViaSPITests;

public interface SimplestPossibleConnectorTests
        extends PokeViaSPITests, DataOnlyTests
{
    @Test
    default void testAdditionalSimplestConnectorFeature(TestInfo testInfo)
    {
        Util.output(testInfo);
    }
}
