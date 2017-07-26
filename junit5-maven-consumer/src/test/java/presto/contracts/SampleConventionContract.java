package presto.contracts;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import presto.contracts.base.ConnectorTests;

import java.util.stream.Stream;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public interface SampleConventionContract
        extends ConnectorTests
{

    @TestFactory
    default Stream<DynamicTest> dynamicTestsFromStream()
    {
        return scanConventionTestCases()
                .map(testCase -> dynamicTest("dynamicTest" + testCase, () -> {
                    System.out.println(
                            "SampleConventionContract.dynamicTest" + testCase + "() for " + getClass().getSimpleName());
                }));
    }

    default Stream<String> scanConventionTestCases()
    {
        System.out.println("SampleConventionContract.scanConventionTestCases() for " + getClass().getSimpleName());
        //We'd scan the classpath for convention test cases here
        return Stream.of("A", "B", "C");
    }
}
