# Usage

Open in IntelliJ IDEA 2017.2 or later. Previous versions have basic support,
but don't allow the feature marked later with (*).

Run all the tests in package 'presto' and observe their output.

(*) Tests from any 'test trait' (a java interface with default @Test methods)
can be run for a single, or all descending test classes. Same goes for any particular
method in the test class. The test traits are in 'presto.contracts' package.

The test trait hierarchy is best described by diagram.png and the underlying source code.
The hierarchy is quite complex in order to show that junit can handle arbitrary
test trait hierrarchies.

The hierarchy is loosely inspired by 
[the comment in Presto#8150](https://github.com/prestodb/presto/issues/8150#issuecomment-306644790).

Overriding / disabling tests is possible by simple method overrides.

Dynamic test cases are supported (see SampleConventionContract).

Inheriting a test trait twice is not a problem as long as method names 
don't clash with its descendants. 

Creation of just one instance of a connector per test is achieved
(see comment in ConnectorTests).

Please see the sources for more commentary.

The TestInfo argument in test methods is only used for outputting the test name
and isn't needed otherwise.
