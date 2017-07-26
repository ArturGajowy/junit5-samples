package presto;

import org.junit.jupiter.api.TestInfo;

import static java.lang.String.format;

public class Util
{
    public static void output(TestInfo testInfo)
    {
        String testName = pad(format("%s.%s", testInfo.getTestClass().get().getSimpleName(), testInfo.getDisplayName()), 80);
        System.out.println(format(testName + " defined in %s", testInfo.getTestMethod().get().getDeclaringClass().getSimpleName()));
    }

    private static String pad(String string, int n)
    {
        String padding = "";
        for (int i = string.length(); i < n; i++) {
            padding += " ";
        }
        return string + padding;
    }
}
