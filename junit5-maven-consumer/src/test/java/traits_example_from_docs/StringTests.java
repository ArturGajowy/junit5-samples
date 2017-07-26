package traits_example_from_docs;

class StringTests
        implements ComparableContract<String>, EqualsContract<String>
{

    @Override
    public String createValue()
    {
        return "foo";
    }

    @Override
    public String createSmallerValue()
    {
        return "bar"; // 'b' < 'f' in "foo"
    }

    @Override
    public String createNotEqualValue()
    {
        return "baz";
    }
}
