package traits_example_from_docs;

public class LongTests
        implements BothContracts<Long>
{

    @Override
    public Long createValue()
    {
        return 42L;
    }

    @Override
    public Long createSmallerValue()
    {
        return -2L; // 'b' < 'f' in "foo"
    }

    @Override
    public Long createNotEqualValue()
    {
        return 5L;
    }
}
