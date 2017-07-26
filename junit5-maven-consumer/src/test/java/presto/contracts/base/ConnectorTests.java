package presto.contracts.base;

import org.junit.jupiter.api.TestInstance;
import presto.Connector;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//The annotation above is 'inherited' by the implementing classes and causes them to be only instantiated once per
//test run, instead of once per test method (as is the case by default and in all previous junit versions).
//This allows for storing the connector on an instance field in the test class, and having instance (not static)
//@BeforeAll methods. It's far from perfect though, as it poses the risk of introducing a hidden test interdependency.
//Maybe I'll manage to have a cleaner way of creating the connectors in latter commits, probably using junit's built-in
//Dependency Injection (http://junit.org/junit5/docs/current/user-guide/#writing-tests-dependency-injection)
public interface ConnectorTests
{
    Connector getConnector();
}
