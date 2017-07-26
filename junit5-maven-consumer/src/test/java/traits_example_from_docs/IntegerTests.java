package traits_example_from_docs;

class IntegerTests
        implements BothContracts<Integer>
{

    @Override
    public Integer createValue()
    {
        return 42;
    }

    @Override
    public Integer createSmallerValue()
    {
        return -2; // 'b' < 'f' in "foo"
    }

    @Override
    public Integer createNotEqualValue()
    {
        return 5;
    }
}
