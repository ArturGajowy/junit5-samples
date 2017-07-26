package traits_example_from_docs;

public interface BothContracts<T extends Comparable<T>>
        extends ComparableContract<T>, EqualsContract<T>
{
}
