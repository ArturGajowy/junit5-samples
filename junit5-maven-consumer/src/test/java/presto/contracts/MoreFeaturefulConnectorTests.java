package presto.contracts;

import presto.contracts.feature.AdvancedReadTests;

public interface MoreFeaturefulConnectorTests
        extends SimplestPossibleConnectorTests, AdvancedReadTests
{
    //Notice that test execution order is affected by the order in the extends clause above.
    //This allows us to run the faster, more basic tests first and only then test specific connector features.
    //Or do otherwise, because if the change is specific to the connector, maybe it should be caught by connector tests?
    //Anyway, we have the choice.
}
